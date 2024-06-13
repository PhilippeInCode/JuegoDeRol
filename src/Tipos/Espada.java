package Tipos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos_Abstractos.Melee;

public class Espada extends Melee {

	public Espada(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño) {
		super(durabilidad, valor, rareza, nombre, daño);
	}

}
