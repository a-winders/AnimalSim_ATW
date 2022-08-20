import java.util.ArrayList;
/*
 * This class is meant to test the objects & methods created in the other classes of the package.
 */
public class Application {

	public static void main(String[] args) {
		
		/*
		* Tests all Location class methods & objects.
		*********************************************

	      			Location Tests

	    *********************************************
		*/
		
		/*
		 * tests empty argument constructor
		 */
//		Location emptyArg1 = new Location();	// empty argument constructor
//		System.out.println(emptyArg1);
		/*
		 * tests preferred constructor
		 */
//		Location prefArg1 = new Location(2,3);	// preferred constructor
//		System.out.println(prefArg1);
		/*
		 * tests getxCoord method
		 */
//		Location getterX1 = new Location();	// getxCoord
//		System.out.println(getterX1.getxCoord());
		
		/*
		 * tests setxCoord method
		 */
		Location setterX1 = new Location();	//setxCoord
		setterX1.setxCoord(3);
		
		/*
		 * tests getyCoord method
		 */
//		Location getterY1 = new Location();	// get yCoord
//		System.out.println(getterY1.getyCoord());
		
		/*
		 * tests setyCoord method
		 */
//		Location setterY1 = new Location();	// set yCoord
//		setterY1.setyCoord(11);
		
		/* COME BACK TO THIS
		 * test update method
		 */
//		Location testUpdate = new Location();	// update method
//		System.out.println(testUpdate.update());
		
		/*
		 * tests getCoordinates method
		 */
//		Location getCoords = new Location();
//		System.out.println(getCoords.getCoordinates());
		
		/*
		 * "Tests" all Animal class objects & methods
		/*
		*********************************************

	    				Animal Tests

	    *********************************************
		/* The code below will return an error since you cannot instantiate an abstract class.
			Animal test = new Animal ();
		*/
		
		
		/*
		 * Tests all Goldfinch class objects & methods.
		*********************************************

      					Goldfinch Tests

		*********************************************
		*/
		
		/*
		 * tests empty argument constructor
		 */
//		Goldfinch emptyArg2 = new Goldfinch ();
//		System.out.println(emptyArg2);
		
		/* COME BACK TO THIS
		 * tests preferred argument constructor
		 */
//		Goldfinch prefArg2 = new Goldfinch (int simID, Location l, wingSpan ws);
//		System.out.println(prefArg2);
		
		/*
		 * tests getWingSpan
		 */
//		Goldfinch getWing = new Goldfinch();
//		System.out.println(getWing.getWingSpan());
		
		/*
		 * tests setWingSpan
		 */
//		Goldfinch setWing = new Goldfinch();
//		setWing.setWingSpan(12.0);
		
		/*
		 * tests toString
		 */
//		Goldfinch info1 = new Goldfinch ();
//		System.out.println(info1.toString());
		
		/*
		 * Tests all BrownBear methods & objects.
		 */
		/*
		*********************************************

					BrownBear Tests

		*********************************************
		*/
		
		/*
		 * Tests empty-argument constructor
		 */
		BrownBear emptyArg3 = new BrownBear();
		System.out.println(emptyArg3);
		
		/* COME BACK TO THIS
		 * Tests preferred constructor
		 */
//		BrownBear prefArg3 = new BrownBear(1, l, "Brown");
//		System.out.println(prefArg3);
		
		/*
		 * Tests getSubSpecies
		 */
		BrownBear getSub = new BrownBear();
		getSub.getSubSpecies();
		
		/*
		 * Tests setSubSpecies
		 */
		BrownBear setSub = new BrownBear();
		setSub.setSubSpecies("Brown");
		
		/*
		 * Tests toString
		 */
		BrownBear info2 = new BrownBear();
		System.out.println(info2.toString());
		
	/*
		BrownBear walk = new BrownBear();
		System.out.println(walk.walk());
	*/	
		
		/*
		 * Tests all Generics methods & objects 
		*********************************************

					Generics Tests

		*********************************************
		*/
		
		ArrayList <Animal> animalList = new ArrayList<>();
		
	}	// end main

}	// end class
