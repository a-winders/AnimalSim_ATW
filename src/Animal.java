/**
 * Abstract class encapsulates a generic animal that can be sub-classed by other classes.
 * @author Adam Winders
 */
public abstract class Animal {
	
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
		simID = 0;
//		Location location = {[0,0]};
		full = false;
		rested = true;
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
	 * Returns eat
	 */
	public boolean eat() {
		return true;
	}	// end eat
	
	/*
	 * Returns sleep
	 */
	public boolean sleep() {
		return true;
	}	// end sleep
	
}	// end class
