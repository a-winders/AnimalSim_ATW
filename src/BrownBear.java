import java.util.ArrayList;
import java.util.Arrays;

/*
 * This class represents an Animal subclass called BrownBear
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
	
	/*
	 * Instance field
	 */
	private String subSpecies = ("Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian");
	// end instance field
	
	/*
	 * Empty-argument constructor
	 */
	public BrownBear () {
		super ();
		subSpecies = "Alaskan";
	}	// end empty-argument constructor
	
	/*
	 * Preferred constructor for the BrownBear object - inherits from Animal and adds subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		super();
		this.simID = simID;
		this.location = l;
		this.subSpecies = subSpecies;
	}	// end preferred constructor
	
	/*
	 * Returns subSpecies
	 */
	public String getSubSpecies() {
		return subSpecies;
	}	// end getSubSpecies

	/*
	 * Sets subSpecies
	 */
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
		
	}	// end setSubSpecies

	/*
	 * Prints a String of information about the BrownBear class.
	 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies = " + subSpecies + ", simID = " + simID + ", location = " + location + ", full = " + full
				+ ", rested = " + rested + "]";
	}	// end toString

	/*
	 * Displays the distance the BrownBear walked using the Walkable interface
	 */
	@Override
	public void walk(int direction) {
		
		/*
		 * Captures current location
		 */
		int currentX = this.location.getxCoord();
		int currentY = this.location.getyCoord();
		
		/*
		 * Captures new location
		 */
		int newX = location.getxCoord();
		int newY = location.getyCoord();
		
		/*
		 * Updates new location for object
		 */
		this.location.setxCoord(newX);
		this.location.setyCoord(newY);
		// TODO Auto-generated method stub
		
	}	// end walk

	/*
	 * Displays the distance the BrownBear swam using the Swimmable interface.
	 */
	@Override
	public void swim(int direction) {
		/*
		 * Captures current location
		 */
		int currentX = this.location.getxCoord();
		int currentY = this.location.getyCoord();
		
		/*
		 * Captures new location
		 */
		int newX = location.getxCoord();
		int newY = location.getyCoord();
		
		/*
		 * Updates new location for object
		 */
		this.location.setxCoord(newX);
		this.location.setyCoord(newY);
		
		// TODO Auto-generated method stub
		
	}	// end swim

	
	
	
	
	
}	// end class
