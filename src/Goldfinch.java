/*
 * This class represents an Animal subclass named Goldfinch
 */
public class Goldfinch<wingSpan> extends Animal implements Flyable, Walkable {
	
	/*
	 * Instance field
	 */
	private double wingSpan;

	/*
	 * Empty argument constructor
	 */
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	}	// end empty argument constructor
	
	/*
	 * Preferred constructor
	 */
	public Goldfinch(int simID, Location l, wingSpan ws) {
		super();
		this.simID = simID;
		this.location = l;
	//	this.wingSpan = ws;
	}	// end preferred constructor
	
	/*
	 * Returns wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}	// end getWingSpan
	
	/*
	 * Sets wingSpan
	 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
		System.out.println(wingSpan);
	}	// end setWingSpan

	/*
	 * Prints a String of information about the Goldfinch class.
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan = " + wingSpan + ", simID = " + simID + ", location = " + location + ", full = " + full
				+ ", rested = " + rested + "]";
	}

	/*
	 * Displays the distance Goldfinch traveled when walking.
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
	 * Displays the distance traveled by GoldFinch flying.s
	 */
	@Override
	public void fly(Location l) {
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
		
	}	// end fly
	
	
	
	
}	// end class
