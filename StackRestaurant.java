import java.util.Arrays;

/**
 * Lab 7
 * 
 * Implementation of the Restaurant abstract class. Stores and completes tickets based on a stack data structure.
 * Tickets are treated in a LIFO manner. That is, the last ticket (most recent) to be added to the restaurant is
 * the first ticket to be completed. This is in contrast to the QueueRestaurant which operates how a restaurant
 * normally would.
 * 
 * @modified by Em Evans
 * @version 2019-30-19	1	
 */
public class StackRestaurant extends Restaurant {

	private Order[] orderList;
	private int topOfStack;
	private int size = 10;

    /**
     * Create the stack restaurant. Initializes the Order storage variables.
     */
	public StackRestaurant()
	{
		this.orderList = new Order[getSize()];
		this.topOfStack = 0;
		
		
	}
    /**
     * Resize the array when more space is needed.
     */
	private void resize()
	{
		this.setSize(getSize() * 2);
		 Order[] temp = new Order[this.getSize()];
		 for (int i = 0; i < orderList.length; ++i)
		 {
			 temp[i] = orderList[i];
		 }
		 
		 this.orderList = temp;
	}
    /**
     * Add an order to the restaurant.
     * 
     * @param order The order to be added.
     * @return True. Because the StackRestaurant should resize if it runs out of room to store tickets, a ticket
     * should always be added, and this method should always return true.
     */
	/**
	@Override
	*/
	public boolean addOrder(Order order)
	{
		//TODO:implement this
		//resize if necessary and then order to stack
		if(orderList.length >= getSize())
		{	
			resize();
		}
		
		orderList[topOfStack] = order;
		this.topOfStack++;
		
		return true;
	}
    /**
     * [Internal Code - This is not required by the specification but can be a useful construct.]
     *
	@Override
	*/
	protected Order completeOrder()
	{
		//TODO: implement this
		//if no orders return -1
		//otherwise update topOfStack and return order at topOfStack
		
		if(topOfStack == 0)
		{
			return orderList[-1];
		}
		else
		{
			this.topOfStack--;
			return orderList[topOfStack];
		}
		
	}
    /**
     * Computes the number of orders in the restaurant that have not been completed.
     * 
     * @return the number of orders to complete.
     *
	@Override
	*/
	public int numberRemainingOrder()
	{
		int counter = 0;
		for(int i = this.topOfStack; i >= 0; --i)
		{
			counter++;
		}
		return counter; 
	}
    /**
     * TODO
     *
	@Override
	*/
	protected Order checkNextCompletedOrder()
	{
		//TODO: return order the next order in line
		this.topOfStack--;
		return orderList[topOfStack];
	}
	public  int getSize() 
	{
		return this.size;
	}
	public  void setSize(int sIZE) 
	{
		this.size = sIZE;
	}
}

