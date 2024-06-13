package Test;

import java.util.ArrayList;

import Enumerados.*;
import Tipos.Jugador;

public class Test {

	public static void main(String[] args) {

		Jugador jugador1 = new Jugador ("Felipe", TIPOS_RAZA.HUMANO, new ArrayList<>(), new ArrayList<>(), TIPOS_CLASE.COMUN, 0, 0, new ArrayList<>(), 1, 100.0, 100);
		Jugador jugador2 = new Jugador ("Monstruo", TIPOS_RAZA.HUMANO, new ArrayList<>(), new ArrayList<>(), TIPOS_CLASE.COMUN, 0, 0, new ArrayList<>(), 0, 100.0, 100);
		
		jugador1.subirExp(96900);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Nivel: " + jugador1.getNivel());
		
	}

}
