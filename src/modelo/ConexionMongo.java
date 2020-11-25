package modelo;

import com.mongodb.MongoClient;

public class ConexionMongo {
	
	public MongoClient conexion() {
		MongoClient mongo = null;
		try {
			mongo = new MongoClient("localhost", 27017);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mongo;
	}

}
