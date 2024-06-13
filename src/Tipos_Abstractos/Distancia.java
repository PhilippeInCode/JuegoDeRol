package Tipos_Abstractos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos.Habilidad;

public abstract class Distancia extends Arma {
	private double rango;
	private int municion;

	public Distancia(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño, double rango, int municion) {
		super(durabilidad, valor, rareza, nombre, daño);
		this.rango = rango;
		this.municion = municion;
	}

	public double getRango() {
		return rango;
	}

	public void setRango(double rango) {
		this.rango = rango;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

}
