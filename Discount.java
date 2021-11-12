package fr.dauphine.javaavance.td5;

//3.4/
public class Discount {

	private long value;

	public Discount(long value) {
		if (value<0) {
			throw new IllegalArgumentException("Only Positive Values Allowed!");
		}else {
			this.value=value;
		}
	}
	
	public long getValue() {
		return value;
	}
}
