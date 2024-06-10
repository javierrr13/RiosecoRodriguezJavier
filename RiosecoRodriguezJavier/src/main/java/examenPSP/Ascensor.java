package examenPSP;

public class Ascensor {
	
	private static String state;
	private static int capacidad,plantaActual;
	
	public Ascensor(String state, int capacidad, int plantaActual) {
		this.setState(state);
		this.capacidad=capacidad;
		this.plantaActual=plantaActual;
	}
	
	public static int getCapacidad() {
		return capacidad;
	}

	public int getPlantaActual() {
		return plantaActual;
	}

	public static void subir() {
		setState("subiendo");
		Personas.planta= plantaActual++;

	}
	public static void bajar() {
		setState("bajando");
		Personas.planta=plantaActual--;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		Ascensor.state = state;
	}
	

}
