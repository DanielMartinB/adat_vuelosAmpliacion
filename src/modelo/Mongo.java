package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Mongo extends ConexionMongo {

	private MongoClient mongo;
	private MongoDatabase bbdd;
	private MongoCollection coleccionVuelos;
	Vuelos vuelos = new Vuelos();
	ConexionMongo con = new ConexionMongo();
	private ArrayList<Integer> asientos = new ArrayList<Integer>();

	public Mongo() {
		mongo = con.conexion();
		bbdd = mongo.getDatabase("adat_vuelosAmpliacion");
		coleccionVuelos = bbdd.getCollection("vuelos");
	}

	public void mostrar() {
		FindIterable fi = coleccionVuelos.find();
		MongoCursor cur = fi.cursor();
				
		while (cur.hasNext()) {
			Document doc = (Document) cur.next();
			System.out.println("ID -> " + (doc.getInteger("id")));
			System.out.println("CODIGO -> " + doc.getString("codigo"));
			System.out.println("ORIGEN -> " + doc.getString("origen"));
			System.out.println("DESTINO -> " + doc.getString("destino"));
			System.out.println("FECHA -> " + doc.getString("fecha"));
			System.out.println("HORA -> " + doc.getString("hora"));
			System.out.println("PLAZAS TOTALES -> " + doc.getInteger("plazas_totales"));
			System.out.println("PLAZAS DISPONIBLES -> " + doc.getInteger("plazas_disponibles"));
			System.out.println();
			System.out.println("--------------------------");
			System.out.println();
		}
	}

	public boolean comprarVuelo(Vuelos vue) {
		try {
			vuelos.setCodigo_vuelo(vue.getCodigo_vuelo());
			Document antiguo = new Document("codigo", vuelos.getCodigo_vuelo());
			DBObject listitem = new BasicDBObject("vendidos",
					new BasicDBObject("asiento", generaAsiento(vuelos.getCodigo_vuelo()))
							.append("dni", vue.getDni())
							.append("apellido", vue.getApellido())
							.append("nombre", vue.getNombre())
							.append("dniPagador", vue.getDni_pagador())
							.append("tarjeta", vue.getTarjeta())
							.append("codigoVenta", generarCodigo()));
			DBObject updateQuery = new BasicDBObject("$push", listitem);
			coleccionVuelos.updateOne(antiguo, (Bson) updateQuery);
			
			FindIterable fi = coleccionVuelos.find(antiguo);
			MongoCursor cur = fi.cursor();
			int plazas_disponibles = 0;
			
			while(cur.hasNext()) {
				Document res = (Document) cur.next();
				plazas_disponibles = res.getInteger("plazas_disponibles");
			}
			DBObject plazas = new BasicDBObject("plazas_disponibles", (plazas_disponibles - 1));
			DBObject updateQuery2 = new BasicDBObject("$set", plazas);
			coleccionVuelos.updateOne(antiguo, (Bson) updateQuery2);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean cancelarVuelo(Vuelos vue) {
		try {
			vuelos.setCodigo_vuelo(vue.getCodigo_vuelo());
			vuelos.setCodigo_venta(vue.getCodigo_venta());
			FindIterable<Document> cursor = coleccionVuelos.find(Filters.eq("codigo", vuelos.getCodigo_vuelo()));
			
			BasicDBObject query = new BasicDBObject("codigo", vuelos.getCodigo_vuelo());
			BasicDBObject fields = new BasicDBObject("vendidos", new BasicDBObject( "codigoVenta", vuelos.getCodigo_venta()));
			BasicDBObject update = new BasicDBObject("$pull", fields);
			coleccionVuelos.updateOne(query, update);
			
			FindIterable fi = coleccionVuelos.find(query);
			MongoCursor cur = fi.cursor();
			int plazas_disponibles = 0;
			
			while(cur.hasNext()) {
				Document res = (Document) cur.next();
				plazas_disponibles = res.getInteger("plazas_disponibles");
			}
			DBObject plazas = new BasicDBObject("plazas_disponibles", (plazas_disponibles + 1));
			DBObject updateQuery2 = new BasicDBObject("$set", plazas);
			coleccionVuelos.updateOne(query, (Bson) updateQuery2);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public int generaAsiento(String vue) {
		int plazas_totales = 0;
		int plazas_disponibles = 0;
		int plazas_libres = 0;
		int asiento = 0;
		FindIterable<Document> cursor = coleccionVuelos.find(Filters.eq("codigo", vuelos.getCodigo_vuelo()));
		
		
		for(Document doc : cursor) {
			plazas_totales = doc.getInteger("plazas_totales");
			plazas_disponibles = doc.getInteger("plazas_disponibles");
			plazas_libres = plazas_totales - plazas_disponibles;
			if(plazas_libres >= 0) {
				asiento = plazas_libres + 1;
			}
		}
		
		for(Document doc : cursor) {
			List<Document> vendidos = doc.get("vendidos", List.class);
			for(Document d : vendidos) {
				asientos.add(d.getInteger("asiento"));
			}
		}
		
		for (int i = 0; i < asientos.size(); i++) {
			System.out.println(asientos.get(i));
		}
		return asiento;
	}

	public String generarCodigo() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder(20);
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		return output;
	}

}
