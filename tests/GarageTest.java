package fr.dauphine.javaavance.td5.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.dauphine.javaavance.td5.Bike;
import fr.dauphine.javaavance.td5.Car;
import fr.dauphine.javaavance.td5.Discount;
import fr.dauphine.javaavance.td5.Garage;

public class GarageTest {

	@Test
	public void garageEquality() {
		 Garage garage1 = new Garage();
		 Garage garage2 = new Garage();

		 Car car1 = new Car("BMW", 90000);
		 Car car2 = new Car("Lada", 6500, 2);
		 Car car3 = new Car("Lada", 5500, 1);
		 Bike bike1 = new Bike("Scott");
		 Bike bike2 = new Bike("Merlin",new Discount(50));
		 Bike bike3 = new Bike("Merlin");
		 
		 garage1.add(car1);
		 garage1.add(bike1);
		 garage1.add(car2);
		 garage1.add(bike2);
		 garage1.add(car3);        
		 garage1.add(bike3);
		 
		 garage2.add(bike1);
		 garage2.add(car1);    
		 garage2.add(car3); 
		 garage2.add(car2);
		 garage2.add(bike3);
		 garage2.add(bike2);       
		 
		 assertEquals(garage1, garage2);
		 
		 //4.1/Le test est un echec car on compare la reference de garage et non le contenu
		 //4.2/Non, car le equals du ArrayList compare selon l'ordre d'insertion aussi pas seulement le contenu
	}
}
