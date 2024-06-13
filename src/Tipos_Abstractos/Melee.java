package Tipos_Abstractos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos.Habilidad;

public abstract class Melee extends Arma {

	public Melee(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño) {
		super(durabilidad, valor, rareza, nombre, daño);
	}

}
