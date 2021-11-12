package fr.dauphine.javaavance.td5;

public class Bike implements Vehicule{
	
	//3.1/
	public String brand;
	
	//3.2/
	private static long VALUE=100;
	
	
	public Bike(String brand) {
		this.brand=brand;
	}


	public Bike(String string, Discount discount) {
		this.VALUE=this.VALUE-discount.getValue();
	}


	@Override
	public long getValue() {
		return this.VALUE;
	}


	@Override
	public String getBrand() {
		return this.brand;
	}

	
}
