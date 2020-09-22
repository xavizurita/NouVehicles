package vehicle3;

import java.util.*;


public class Vehicle {
	private String plate;				
	private String brand;
	private String color;
//	private List<Wheel> frontwheels = new ArrayList<Wheel>();		// OJO CON EL PROITECTED // faltara la creacio de l'arraylist que hi ha en el exemple amb, si cal setteres i getters
//	private List<Wheel> backwheels = new ArrayList<Wheel>();		//estem creant un ssegon array 1 x rodes davanteres i un per traseres ja que en l'exercici nomes parla d'un array pero despres pregunta per 2

	public Vehicle(String plate, String brand, String color) {
		super();
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
