package com.luv2code.web.jdbc;

public class Pokemon {

	//atributos
	private int id;
	private String nombre;
	private String tipo;
	private String ataque;
	private String evolucion;

	//constructor sin id
	public Pokemon(String nombre, String tipo, String ataque, String evolucion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.evolucion = evolucion;
	}
	
	//constructor con id
	public Pokemon(int id, String nombre, String tipo, String ataque, String evolucion) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.evolucion = evolucion;
	}

	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAtaque() {
		return ataque;
	}

	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	
	public String getEvolucion() {
		return evolucion;
	}

	public void setEvolucion(String evolucion) {
		this.evolucion = evolucion;
	}

	//Método toString
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", ataque=" + ataque + ", evolucion=" + evolucion +"]";
	}	
}
