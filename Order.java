import java.util.Date;

/**
 * Lab 7
 * 
 * Class to represent a meal order submitted to a restaurant. Orders have a description (i.e. what food was
 * ordered) as well as a timeOrdered (i.e. when the food was ordered/when the ticket was created) and a 
 * server (i.e. a number indicating which server is assigned to.
 * 
 * @author Stephen
 * @version 2018-02-26
 * 
 * @modified by Em Evans
 * @version 2019-09-27
 */

public class Order implements Comparable<Order>
{
	/**
	 * The description of the order. i.e. what food was ordered.
	 */
	private String description;
	/**
	 * The time (represented as an int) that the customers ordered it.
	 */
	private int timeOrdered;

	
    /**
     * Create an Order. Set all attributes. 
     * 
     * @param description 
     * @param timeOrdered
     */
	public Order(String description, int timeOrdered)
	{
		//TODO: implement this constructor 

	}
	/**
	 * @return description
	 */
	public String getDescription()
	{
	    // TODO: implement this.
	}
	/**
	 * @return timeOrdered
	 */
	public int getTimeOrdered()
	{
	    // TODO: implement this.
	}
	
	/**
	 * toString override. 
	 * @return a String of the format "Description: <<description>>"
	**/
	@Override
	public String toString()
	{
		// TODO: implement this
	}
    /**
     * Comparison override. Comparison for Orders sorts the orders in order of when the order
     * was created.
     * 
     * @param other The other ticket to compare this one to.
     * @return -1 if this ticket was created before the other ticket
     *          0 if this ticket was created at the same time as the other ticket
     *          1 if this ticket was created after the other ticket
     */
	@Override
	public int compareTo(Order order)
	{
		//TODO: implement this
	}
}