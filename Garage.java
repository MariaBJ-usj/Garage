package fr.dauphine.javaavance.td5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

//1.6/
public class Garage {
	
	//3.3/Les Classes Car et Bike implementent l'interface Vehicule pour qu'on puisse mettre tous les objects qui implementent
	//Cette classe dans le garage

	private ArrayList<Vehicule> garage;
	private static int IDincrement;
	private int id;
	
	public Garage() {
		this.garage=new ArrayList<Vehicule>();
		this.id=IDincrement;;
		IDincrement++;
	}
	
	public void add(Vehicule vehicule) {
		Objects.requireNonNull(vehicule, "Vehicule must not be null");
	    this.garage.add(vehicule);
	}
	
	//1.7/
	public int getId() {
		return id;
	}

	//1.8/
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("Garage "+id+": ");
		for (Vehicule vehicule : garage) {
			sb.append(vehicule+", ");
		}
		sb.delete(sb.length()-1, sb.length());
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res=true;
		for (Vehicule vehicule : this.garage) {
			if (!((Garage) obj).contains(vehicule)) {
				res=false;
			}
		}
		return res;
	}
	
	//1.9/
	public long value() {
		long gValue=0;
		for (Vehicule vehicule : garage) {
			gValue+=vehicule.getValue();
		}
		return gValue;
	}
	
	//1.10/
	public Vehicule firstCarByBrand(String brand) {
		Vehicule firstVehicule=null;
		for (Vehicule vehicule : garage) {
			if (vehicule.getBrand().equals(brand)) {
				firstVehicule=vehicule;
				break;
			}
		}
		if (firstVehicule != null) {
			return firstVehicule;
		}else {
			throw new NoSuchElementException("There is no with this brand");
		}
	}
	
	public boolean contains(Vehicule vehicule) {
		if (this.garage.contains(vehicule)) {
			return true;
		}
		return false;
	}
	
	//2.4/
	public void remove(Vehicule vehicule) {
		this.garage.remove(vehicule);
	}
	
	//3.5/
	public void protectionism(String brand) {
		Iterator<Vehicule> it = this.garage.iterator();
	    while(it.hasNext()) {
	      Vehicule i = it.next();
	      if(i.getBrand()==brand) {
	        it.remove();
	      }
	    }
	}
	
	//4.2/
	public boolean equals(Garage g) {
		return this.garage.equals(g);
	}
}
