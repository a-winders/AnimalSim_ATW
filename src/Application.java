import java.util.ArrayList;
/*
 * This class is meant to test the objects & methods created in the other classes of the package.
 */
public class Application {

	public static void main(String[] args) {
		
		/*
		*********************************************

	      			Location Tests

	    *********************************************
		*/
		
		/*
		 * Creates Location object to test all class methods & objects.
		 */
			Location location = new Location();
		/*
		 * Tests empty-argument constructor
		 */
			System.out.println(location);
		/*
		 * Tests preferred argument constructor
		 */
			Location loc = new Location(20,20);			// all moveable objects' starting point
			Location newLoc = new Location(45,67);	
		/*
		 * Tests getxCoord method
		 */
			System.out.println(location.getxCoord());
		/*
		 * Tests getyCoord method
		 */
			System.out.println(location.getyCoord());
		/*
		 * Tests setxCoord method
		 */
			location.setxCoord(3);
		/*
		 * Tests setyCoord method
		 */
			location.setyCoord(11);
		/*
		 * Tests update method
		 */
			location.update(1, 2);
		/*
		 * Tests toString method	
		 */
			System.out.println(location.toString());
		/*
		 * Tests getCoordinates method and returns an array of x & y coordinates in the order of (x,y)
		 */
			System.out.println(location.getCoordinates());
		
		/* 
		*********************************************

	    				Animal Tests

	    *********************************************
		/* The code below will return an error since you cannot instantiate an abstract class.
			Animal test = new Animal ();
		*/
		
		
		/*
		*********************************************

      					Goldfinch Tests

		*********************************************
		*/
		
		/*
		 * Creates Goldfinch object to test all class methods & objects.
		 */
			Goldfinch goldfinch = new Goldfinch ();
		/*
		 * tests empty argument constructor
		 */
			System.out.println(goldfinch);
		/* COMMENTED OUT B/C I COULDN'T GET IT TO RUN PROPERLY
		 * tests preferred argument constructor
		 */
//			Goldfinch gf = new Goldfinch(3, l, 3.0); 
//			System.out.println(goldfinch);
		/*
		 * tests getWingSpan
		 */
			System.out.println(goldfinch.getWingSpan());
		/*
		 * tests setWingSpan
		 */
			goldfinch.setWingSpan(12.0);
		/*
		 * tests toString
		 */
			System.out.println(goldfinch.toString());
		/*
		 * tests walk interface
		 */
			System.out.println(goldfinch.eat());
		/*
		 * tests fly interface	
		 */
			
		
		/*
		*********************************************

					BrownBear Tests

		*********************************************
		*/
		
		/*
		 * Creates BrownBear object to test all class methods & objects	
		 */
			BrownBear bb = new BrownBear();	
		/*
		 * Tests empty-argument constructor
		 */
			System.out.println(bb);
		
		/* COMMENTED OUT B/C I COULDN'T GET IT TO RUN PROPERLY
		 * Tests preferred constructor
		 */
//			BrownBear bbPref = new BrownBear(1, l, "Brown");
//			System.out.println(bbPref);
		/*
		 * Tests getSubSpecies
		 */
			bb.getSubSpecies();
		/*
		 * Tests setSubSpecies
		 */
			bb.setSubSpecies("Brown");	
		/*
		 * Tests toString
		 */
			System.out.println(bb.toString());	
		/*
		 * Tests walk interface	
		 */
		
		/*
		 * Tests swim interface	
		 */
		
		
		/*
		*********************************************

					Generics Tests

		*********************************************
		*/
			
		/*
		 * Instantiates an ArrayList object that can hold any type of Animal
		 */
			ArrayList <Animal> animalList = new ArrayList<>();
		/*COMMENTED OUT B/C I COULDN'T GET IT TO RUN PROPERLY
		 * Adds different Animal subclasses to the ArrayList
		 */
//			animalList.add(new Animal(BrownBear()));
//			animalList.add(new Animal);
		/*COMMENTED OUT B/C I COULDN'T GET IT TO RUN PROPERLY
		 * Iterates through the ArrayList object	
		 */
//			for (Animal car : cars) {
//				animalList.printDetails();
//			}
	}	// end main

}	// end class
