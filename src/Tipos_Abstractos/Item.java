package Tipos_Abstractos;

import Enumerados.TIPOS_RAREZA;

public abstract class Item {

	private double durabilidad;
	private double valor;
	private TIPOS_RAREZA rareza;
	private String nombre;

	public Item(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre) {
		super();
		this.durabilidad = durabilidad;
		this.valor = valor;
		this.rareza = rareza;
		this.nombre = nombre;
	}

	public double getDurabilidad() {
		return durabilidad;
	}

	public void setDurabilidad(double durabilidad) {
		this.durabilidad = durabilidad;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TIPOS_RAREZA getRareza() {
		return rareza;
	}

	public void setRareza(TIPOS_RAREZA rareza) {
		this.rareza = rareza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
