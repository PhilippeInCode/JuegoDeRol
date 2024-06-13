package Estaticas;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Enumerados.TIPO_DAÑO;
import Tipos.Habilidad;

public class DatosJuego {

	public static final Map<Integer, Integer> relacionNivelSalud = Collections
			.unmodifiableMap(inicializarMapRelacionNivelSalud());

	public static final Map<Integer, Integer> relacionNivelMana = Collections
			.unmodifiableMap(inicializarMapRelacionNivelMana());
	
	public static final Map<Integer, Integer> relacionNivelExperiencia = Collections
			.unmodifiableMap(inicializarMapRelacionNivelExperiencia());

	public static final List<Habilidad> listaHabilidadesEspada = Collections.unmodifiableList(getHabilidadesEspada());

	public static final List<Habilidad> listaHabilidadesLanza = Collections.unmodifiableList(getHabilidadesLanza());

	public static final List<Habilidad> listaHabilidadesBaculoFuego = Collections
			.unmodifiableList(getHabilidadesBaculoDeFuego());

	private static Map<Integer, Integer> inicializarMapRelacionNivelSalud() {
		Map<Integer, Integer> tempMap = new HashMap<>();
		tempMap.put(1, 10);
		tempMap.put(2, 25);
		tempMap.put(3, 60);
		tempMap.put(4, 80);
		tempMap.put(5, 110);
		tempMap.put(6, 150);
		tempMap.put(7, 190);
		tempMap.put(8, 220);
		tempMap.put(9, 270);
		tempMap.put(10, 325);
		return tempMap;

	}

	private static Map<Integer, Integer> inicializarMapRelacionNivelExperiencia() {
		Map<Integer, Integer> tempMap = new HashMap<>();
		tempMap.put(1, 10000);
		tempMap.put(2, 25000);
		tempMap.put(3, 36000);
		tempMap.put(4, 48000);
		tempMap.put(5, 51000);
		tempMap.put(6, 65000);
		tempMap.put(7, 79000);
		tempMap.put(8, 82000);
		tempMap.put(9, 97000);
		return tempMap;
	}

	private static Map<Integer, Integer> inicializarMapRelacionNivelMana() {
		Map<Integer, Integer> tempMap = new HashMap<>();
		tempMap.put(1, 100);
		tempMap.put(2, 250);
		tempMap.put(3, 360);
		tempMap.put(4, 480);
		tempMap.put(5, 510);
		tempMap.put(6, 650);
		tempMap.put(7, 790);
		tempMap.put(8, 820);
		tempMap.put(9, 970);
		tempMap.put(10, 1325);
		return tempMap;

	}

	// Método privado estático que devuelve una lista de habilidades para una espada
	private static List<Habilidad> getHabilidadesEspada() {
		List<Habilidad> habilidades = new ArrayList<>();

		habilidades.add(new Habilidad("Corte Veloz", TIPO_DAÑO.CORTE, 10, Duration.ofSeconds(5)));
		habilidades.add(new Habilidad("Estocada Precisa", TIPO_DAÑO.CORTE, 15, Duration.ofSeconds(8)));
		habilidades.add(new Habilidad("Golpe Brutal", TIPO_DAÑO.CORTE, 20, Duration.ofSeconds(12)));
		habilidades.add(new Habilidad("Danza de Espadas", TIPO_DAÑO.CORTE, 25, Duration.ofSeconds(15)));

		return habilidades;
	}

	// Método privado estático que devuelve una lista de habilidades para una lanza
	private static List<Habilidad> getHabilidadesLanza() {
		List<Habilidad> habilidades = new ArrayList<>();

		habilidades.add(new Habilidad("Lanza Relámpago", TIPO_DAÑO.ESTOCADA, 12, Duration.ofSeconds(6)));
		habilidades.add(new Habilidad("Estocada Mortal", TIPO_DAÑO.ESTOCADA, 18, Duration.ofSeconds(10)));
		habilidades.add(new Habilidad("Ciclón de Lanza", TIPO_DAÑO.ESTOCADA, 22, Duration.ofSeconds(14)));
		habilidades.add(new Habilidad("Empalamiento", TIPO_DAÑO.ESTOCADA, 30, Duration.ofSeconds(20)));

		return habilidades;
	}

	// Método privado estático que devuelve una lista de habilidades para un báculo
	// de fuego
	private static List<Habilidad> getHabilidadesBaculoDeFuego() {
		List<Habilidad> habilidades = new ArrayList<>();

		habilidades.add(new Habilidad("Bola de Fuego", TIPO_DAÑO.FUEGO, 20, Duration.ofSeconds(5)));
		habilidades.add(new Habilidad("Llama Ardiente", TIPO_DAÑO.FUEGO, 25, Duration.ofSeconds(8)));
		habilidades.add(new Habilidad("Tormenta Ígnea", TIPO_DAÑO.FUEGO, 30, Duration.ofSeconds(12)));
		habilidades.add(new Habilidad("Explosión de Fuego", TIPO_DAÑO.FUEGO, 35, Duration.ofSeconds(15)));

		return habilidades;
	}

}
