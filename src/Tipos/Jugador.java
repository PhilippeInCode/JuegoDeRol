package Tipos;

import java.util.List;
import java.util.Map;

import Enumerados.TIPOS_CLASE;
import Enumerados.TIPOS_RAZA;
import Estaticas.DatosJuego;
import Tipos_Abstractos.Arma;
import Tipos_Abstractos.Personaje;

public class Jugador extends Personaje {
	private List<Arma> armas;
	private List<Armadura> armadura;
	private TIPOS_CLASE clase;
	private int vidaActual;
	private int manaActual;
	private List<Habilidad> habilidades;
	private int nivel;
	private double dinero;
	private int expAcumulada;

	public Jugador(String nombre, TIPOS_RAZA raza, List<Arma> armas, List<Armadura> armadura, TIPOS_CLASE clase,
			int vidaActual, int manaActual, List<Habilidad> habilidades, int nivel, double dinero, int expAcumulada) {
		super(nombre, raza);
		this.armas = armas;
		this.armadura = armadura;
		this.clase = clase;
		this.vidaActual = vidaActual;
		this.manaActual = manaActual;
		this.habilidades = habilidades;
		this.nivel = nivel;
		this.dinero = dinero;
		this.expAcumulada = expAcumulada;
	}

	public List<Arma> getArmas() {
		return armas;
	}

	public void setArmas(List<Arma> armas) {
		this.armas = armas;
	}

	public List<Armadura> getArmadura() {
		return armadura;
	}

	public void setArmadura(List<Armadura> armadura) {
		this.armadura = armadura;
	}

	public TIPOS_CLASE getClase() {
		return clase;
	}

	public void setClase(TIPOS_CLASE clase) {
		this.clase = clase;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

	public int getManaActual() {
		return manaActual;
	}

	public void setManaActual(int manaActual) {
		this.manaActual = manaActual;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public int getExpAcumulada() {
		return expAcumulada;
	}

	public void setExpAcumulada(int expAcumulada) {
		this.expAcumulada = expAcumulada;
	}

	public void subirExp(int exp) {
	int nivel = this.getNivel();
	int expActual = this.getExpAcumulada();
	int expResult = expActual + exp;
	
	while(expResult > DatosJuego.relacionNivelExperiencia.get(this.nivel))	{
		expResult = expResult - (DatosJuego.relacionNivelExperiencia.get(this.nivel) - expActual);
		expActual = 0;
		nivel++;
	}
	expActual = expResult;
	setNivel(nivel);
	}
	
	public void crearJugador() {
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
