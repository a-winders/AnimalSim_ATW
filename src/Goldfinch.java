/*
 * This class represents an Animal subclass named Goldfinch
 */
public class Goldfinch<wingSpan>  extends Animal implements Flyable, Walkable {
	
	/*
	 * Instance field
	 */
	private double wingSpan;

	/*
	 * Empty argument constructor
	 */
	public Goldfinch() {
		super();
		this.wingSpan = 9.0;
	}	// end empty argument constructor
	
	/*
	 * Preferred constructor
	 */
	public Goldfinch(int simID, Location l, wingSpan ws) {
		super();
		this.simID = simID;
		this.location = l;
		this.wingSpan = (double) ws;
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
		direction = 1;
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
		
		/*
		 * Sets direction as (x-coordinate + 1 units) & (y-coordinate + 1 units)
		 */
		direction = Math.abs(currentX-newX+1) + Math.abs(currentY-newY+1);
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
		
		/*
		 * Sets direction as (x-coordinate + 2 units) & (y-coordinate + 2 units) using Euclidian distance
		 */
		Math.sqrt(Math.pow(currentX-newX, 2) + Math.pow(currentY-newY, 2));
	}	// end fly
	
	
	
	
}	// end class
