package Tipos_Abstractos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos.Habilidad;

public abstract class Arma extends Item {

	private Double daño;

	public Arma(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño) {
		super(durabilidad, valor, rareza, nombre);
		this.daño = daño;
	}

	public Double getDaño() {
		return daño;
	}

	public void setDaño(Double daño) {
		this.daño = daño;
	}


}
