package Tipos;

import java.util.List;

public class Escenario {
	private double x;
	private double y;
	private List<NPC> personajesNPC;
	private List<Enemigo> enemigos;
	private String nombre;

	public Escenario(double x, double y, List<NPC> personajesNPC, List<Enemigo> enemigos, String nombre) {
		super();
		this.x = x;
		this.y = y;
		this.personajesNPC = personajesNPC;
		this.enemigos = enemigos;
		this.nombre = nombre;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public List<NPC> getPersonajesNPC() {
		return personajesNPC;
	}

	public void setPersonajesNPC(List<NPC> personajesNPC) {
		this.personajesNPC = personajesNPC;
	}

	public List<Enemigo> getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(List<Enemigo> enemigos) {
		this.enemigos = enemigos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
