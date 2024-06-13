package Tipos;

import java.util.List;

import Enumerados.TIPOS_RAREZA;
import Tipos_Abstractos.Distancia;

public class BaculoFuego extends Distancia {

	public BaculoFuego(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, Double daño, double rango, int municion) {
		super(durabilidad, valor, rareza, nombre, daño, rango, municion);
	}

}
