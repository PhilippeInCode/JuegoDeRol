package Tipos_Abstractos;

import Enumerados.TIPOS_RAZA;

public abstract class Personaje {
	private String nombre;
	private TIPOS_RAZA raza;

	public Personaje(String nombre, TIPOS_RAZA raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TIPOS_RAZA getRaza() {
		return raza;
	}

	public void setRaza(TIPOS_RAZA raza) {
		this.raza = raza;
	}

}
