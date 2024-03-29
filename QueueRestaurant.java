/**
 * Lab 7
 * 
 * Implementation of the Restaurant abstract class. Stores and completes tickets based on a queue data structure.
 * Tickets are treated in a FIFO manner. That is, the first ticket to be added to the restaurant is
 * the first ticket to be completed. i.e. the QueueRestaurant behaves as one would expect a normal restaurant to.
 * The first person to order food will be the first person served.
 * 
 * @author Stephen
 * @version 2018-10-10
 * 
 * @modified by Em Evans
 * @version 2019-30-09
 */
public class QueueRestaurant extends Restaurant{
	
	private Order[] orderList;
	private int head;
	private int tail;
	private int numOrders;
	
	public QueueRestaurant(int maxSize)
	{
		this.orderList = new Order[maxSize];
		this.head = 0;
		this.tail = 0;
		this.numOrders =0;
	}
    /**
     * Add an order to the restaurant. If there is no more room (number of tickets in the restaurant == maxSize of
     * queueRestaurant), do not add an order and return false.
     * 
     * @param order The Order to be added.
     * @return 
     */
	public boolean addOrder(Order order)
	{
		if(this.numOrders < orderList.length)
		{
			//Increment the number of orders
			this.numOrders++;
			
			//inserting the parameter order after the last element.
			orderList[this.head] = order;
			
			//Increment the head to add a new element after it
			this.head = head++;
			
			return true;
		}
		else
		{
			return false;
		}
	}
    /**
     * [Internal Code - This is not required by the specification but can be a useful construct.]
     * 
     */
	
	/**
	@Override
	*/
	protected Order completeOrder()
	{
		
		//If no orders, return null
		if(numOrders == 0)
		{
			return null;
		}
	    //Get first submitted order
		Order first = orderList[tail];
		
		//Update the numOrders and tail and return
		this.numOrders--;
		this.tail++;
		
		/*Order[] temp = new Order[orderList.length - 1];
		for(int i = 0, j = tail ; i < orderList.length; i++, j++)
		{
			temp[i] = orderList[j];
		}
		
		this.orderList = temp; */
		
		return first;
		
		
	}
    /**
     * Computes the number of orders in the restaurant that have not been completed.
     * 
     * @return the number of orders to complete.
     */
	/**
	@Override
	*/
	protected int numberRemainingOrder()
	{
		
		return this.numOrders;
	}
    /**
     * [Internal Code - This is not required by the specification but can be a useful construct.]
     */
	/**
	@Override
	*/
	protected Order checkNextCompletedOrder()
	{
		
		//check that the is at least one order
		if(head == tail)
		{
			return null;
		}
		//if yes, return the next order to be completed
		else
		{
			return orderList[this.tail];
		}
	}
}
