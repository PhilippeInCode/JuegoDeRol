package Tipos;

import Enumerados.PARTE_ARMADURA;
import Enumerados.TIPOS_RAREZA;
import Tipos_Abstractos.Item;

public class Armadura extends Item {
	private PARTE_ARMADURA partes;

	public Armadura(double durabilidad, double valor, TIPOS_RAREZA rareza, String nombre, PARTE_ARMADURA partes) {
		super(durabilidad, valor, rareza, nombre);
		this.partes = partes;
	}

	public PARTE_ARMADURA getPartes() {
		return partes;
	}

	public void setPartes(PARTE_ARMADURA partes) {
		this.partes = partes;
	}

}
