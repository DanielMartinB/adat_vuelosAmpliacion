package modelo;

public class Vuelos {
	
	private int id;
	private String codigo_vuelo;
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	private int plazas_totales;
	private int plazas_disponibles;
	private int asiento;
	private String dni;
	private String nombre;
	private String apellido;
	private String dni_pagador;
	private String tarjeta;
	private String codigo_venta;
	

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni_pagador() {
		return dni_pagador;
	}

	public void setDni_pagador(String dni_pagador) {
		this.dni_pagador = dni_pagador;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getCodigo_venta() {
		return codigo_venta;
	}

	public void setCodigo_venta(String codigo_venta) {
		this.codigo_venta = codigo_venta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo_vuelo() {
		return codigo_vuelo;
	}

	public void setCodigo_vuelo(String codigo_vuelo) {
		this.codigo_vuelo = codigo_vuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getPlazas_totales() {
		return plazas_totales;
	}

	public void setPlazas_totales(int plazas_totales) {
		this.plazas_totales = plazas_totales;
	}

	public int getPlazas_disponibles() {
		return plazas_disponibles;
	}

	public void setPlazas_disponibles(int plazas_disponibles) {
		this.plazas_disponibles = plazas_disponibles;
	}

}
