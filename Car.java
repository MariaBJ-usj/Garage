package fr.dauphine.javaavance.td5;

public class Car implements Vehicule{
	
	//1.1/
	private final String brand;
	private final long value;
	private int vetuste;
	
	//1.2
	public Car(String brand, long value) {
		
		//1.3/
		if (value<0) {
			throw new IllegalArgumentException("Only Positive Values Allowed!");
		}else {
			this.brand=brand;
			this.value=value;
			this.vetuste=0;
		}
	}
	
	public Car(String brand, long value, Discount discount) {
		
		if (value<0) {
			throw new IllegalArgumentException("Only Positive Values Allowed!");
		}else {
			this.brand=brand;
			this.value=value-discount.getValue();
			this.vetuste=0;
		}
	}
	
	//1.11
	public Car(String brand, long value, int vetuste) {
		
		if (value<0) {
			throw new IllegalArgumentException("Only Positive Values Allowed!");
		}else {
			this.brand=brand;
			this.value=value;
			this.vetuste=vetuste;
		}
	}
	
	public Car(String brand, long value, int vetuste, Discount discount) {
		
		if (value<0) {
			throw new IllegalArgumentException("Only Positive Values Allowed!");
		}else {
			this.brand=brand;
			this.value=value;
			this.vetuste=vetuste;
		}
	}

	//1.4/
	public String getBrand() {
		return brand;
	}

	//1.11
	public long getValue() {
		return value-(1000*this.vetuste);
	}

	//1.5/
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", value=" + value + "]";
	}
	
	//2.2/
	@Override
	public boolean equals(Object obj) {
		if (((Car) obj).getBrand()==this.getBrand()&((Car) obj).getValue()==this.getValue()) {
			return true;
		}
		return false;
	}
	
//	//2.1
//	public boolean equals(Car car) {
//		if ((car).getBrand()==this.getBrand()&(car).getValue()==this.getValue()) {
//			return true;
//		}
//		return false;
//	}
	
	//2.3/
	@Override
    public int hashCode() {
		int hash = this.vetuste;
		hash = hash + this.brand.hashCode() + (int) (this.value);
        return hash;
	}
	
	
}
