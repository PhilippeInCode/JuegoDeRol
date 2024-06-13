package Tipos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos_Abstractos.Melee;

public class Lanza extends Melee {

	public Lanza(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño) {
		super(durabilidad, valor, rareza, nombre, daño);
	}

}
