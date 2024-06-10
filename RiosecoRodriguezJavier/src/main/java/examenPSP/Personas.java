package examenPSP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Personas extends Thread {

	public static int id, planta;
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public Personas(int id, int planta) {
		this.id = (int) Thread.currentThread().getId();
	}

	public static void entrar() {
		System.out.println("Persona " +id + " ha entrado en el ascensor");
	}

	public static void salir() {
		System.out.println("Persona " + id + " ha salido del ascensor ");
		
	}
	public synchronized void Acceso() {
		
		while(Ascensor.getState()=="parado" || Ascensor.getCapacidad() < 8) {
			Personas.entrar();
			
		}
	}
	
	public void run() {
		try {
			planta = (int) (Math.random() * 20) / 20;
			System.out.println("Persona " + id + " se encuentra en la planta " + planta);
			Thread.sleep(2222l);
			System.out.println("¿Que desea hacer? S/B");
			String decision = bf.readLine();
			switch (decision) {
			case "S":
				Ascensor.subir();
				System.out.println("Ascensor Subiendo ...");
				break;
			case "B":
				Ascensor.bajar();
				System.out.println("Ascensor Bajando ...");
			default:
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
