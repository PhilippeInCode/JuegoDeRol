package Tipos;

import java.time.Duration;

import Enumerados.TIPO_DAÑO;

public class Habilidad {

	private String nombre;
	private TIPO_DAÑO tipo_daño;
	private int coste_mana;
	private Duration cooldown;

	public Habilidad(String nombre, TIPO_DAÑO tipo_daño, int coste_mana, Duration cooldown) {
		super();
		this.nombre = nombre;
		this.tipo_daño = tipo_daño;
		this.coste_mana = coste_mana;
		this.cooldown = cooldown;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TIPO_DAÑO getTipo_daño() {
		return tipo_daño;
	}

	public void setTipo_daño(TIPO_DAÑO tipo_daño) {
		this.tipo_daño = tipo_daño;
	}

	public int getCoste_mana() {
		return coste_mana;
	}

	public void setCoste_mana(int coste_mana) {
		this.coste_mana = coste_mana;
	}

	public Duration getCooldown() {
		return cooldown;
	}

	public void setCooldown(Duration cooldown) {
		this.cooldown = cooldown;
	}

}
