package Tipos;

import Enumerados.TIPOS_RAZA;
import Tipos_Abstractos.Personaje;

public class Enemigo extends Personaje {
	private double loot;
	private int exp;

	public Enemigo(String nombre, TIPOS_RAZA raza, double loot, int exp) {
		super(nombre, raza);
		this.loot = loot;
		this.exp = exp;
	}

	public double getLoot() {
		return loot;
	}

	public void setLoot(double loot) {
		this.loot = loot;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
