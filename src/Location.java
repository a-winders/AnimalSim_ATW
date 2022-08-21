import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * This class encapsulates a point on a simulation map.
 * @author awinders
 * Final Programming Project
 * CS131-ON
 */
public class Location {
	/*
	 * instance field
	 */
	private int xCoord;	// represents the x-axis coordinate on a map
	private int yCoord;	// represents the y-axis coordinate on a map
	
	/*
	 * Places the xCoord & yCoord into a consistent state by defaulting them to 0.
	 */
	public Location () {
		this.xCoord = 0;
		this.yCoord = 0;
	}	// end empty-argument constructor
	
	/*
	 * Preferred constructor for the Location object.
	 * Sets x & y coordinate to whatever the user passes in.
	 */
	public Location(int x, int y) {
		super();
		this.setxCoord(x);
		this.setyCoord(y);
	}	// end preferred constructor
	
	/*
	 * Returns the x-axis coordinate.
	 */
	public int getxCoord() {
		return xCoord;
		
	}	// end getxCoord

	/*
	 * Sets the x-axis coordinate,as long as the value passed in is greater than 0.
	 * Prints value to the console to demonstrate it is working properly.
	 */
	public void setxCoord(int xCoord) {
		if (xCoord > 0)	
			this.xCoord = xCoord;
		else
			this.xCoord = 0;
	}	// end setxCoord

	/*
	 * Returns the y-axis coordinate.
	 */
	public int getyCoord() {
		return yCoord;
	}	// end getyCoord

	/*
	 * Sets the y-axis coordinate.
	 */
	public void setyCoord(int yCoord) {
		if (yCoord > 0)	
			this.yCoord = yCoord;
		else
			this.yCoord = 0;
	}	// end setyCoord

	/*
	 * Allows Location to create a clone of itself (update) each time the "move" method is run.
	 */
	public void update (int x, int y) {
		this.setxCoord(x);
		this.setyCoord(y);
		
	}	// end update
	
	
	/* 
	 * Prints x & y coordinates to console.
	 */
	@Override
	public String toString() {
		return "Location [xCoord = " + xCoord + ", yCoord = " + yCoord + "]";
	}	// end toString

	/*
	 * Returns an array of x-coordinate & y-coordinate, in that order.
	 */
	public ArrayList getCoordinates () {
		ArrayList coordinates = new ArrayList();
		coordinates.add(xCoord);
		coordinates.add(yCoord);
		return coordinates;
		
	}	// end getCoordinates

}	// end class
