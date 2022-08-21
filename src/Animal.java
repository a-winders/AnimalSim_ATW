import java.lang.Math;

/**
 * Abstract class encapsulates a generic animal that can be sub-classed by other classes.
 * @author Adam Winders
 */
public abstract class Animal   {
	
	/*
	 * instance field
	 */
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	// end instance fields
	
	/*
	 * This constructor defaults the instance field variables if no arguments are passed in.
	 */
	public Animal() {
		super();
		this.simID = 0;
		this.location = new Location(0,0);
		this.full = false;
		this.rested = true;
	}	// end empty-argument constructor
	
	/*
	 * Preferred constructor will set instance field variables to the values passed in for simID & l
	 */
	public Animal(int simID, Location l) {
		super();
		this.simID = simID;
		this.location = l;
		this.full = false;
		this.rested = true;
	}	// end preferred constructor
	
	/*
	 * Returns simID
	 */
	public int getSimID() {
		return simID;
	}	// end getSimID
	
	/*
	 * Sets simID
	 */
	public void setSimID(int simID) {
		this.simID = simID;
	}	// send setSimID
	
	/*
	 * Returns Location
	 */
	public Location getLocation() {
		return location;
	}	// end getLocation
	
	/*
	 * Sets Location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}	// end setLocation
	
	/*
	 * Returns full
	 */
	public boolean isFull() {
		return full;
	}	// end isFull
	
	/*
	 * Sets full
	 */
	public void setFull(boolean full) {
		this.full = full;
	}	// end setFull
	
	/*
	 * Returns rested
	 */
	public boolean isRested() {
		return rested;
	}	// end isRested
	
	/*
	 * Sets rested
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	}	// end setRested
	
	/*
	 * Returns false and sets full to false if the randomly generated number is less than or equal to 0.5.
	 * Returns true otherwise.
	 */
	public boolean eat() {
		int min = 0;
		int max = 1;
		double number = Math.random()*(max-min+1)+min;
		if (number <= .5) {
			this.setFull(false);
			return false;
		}
		else {
			full = true;
			return true;
		}
	}	// end eat
	
	/*
	 * Returns false and sets rested to false if the randomly generated number is less than or equal to 0.5.
	 * Returns true otherwise.
	 */
	public boolean sleep() {
		int min = 0;
		int max = 1;
		double number = Math.random()*(max-min+1)+min;
		if (number <= .5) {
			this.setRested(false);
			return false;
		}
		else {
			rested = true;
			return true;
		}	
	}	// end sleep
	
}	// end class
