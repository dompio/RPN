/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 28/01/2018
 */
public class Stack 
{
	private List myList;
	
    /**
     * Default constructor. Initialize fields to default values
     */
	public Stack()
	{
		myList = new List();
	}
	
	/**
	 * Push a new node to the top of the Stack which will contain
	 * the data provided (a number).
	 * 
	 * @param number The number entered  by user
	 */
	public void push(double number)
	{
		myList.push(number);
	}
	
	/**
	 * Pop a node from the top of the Stack
	 * 
	 * @return An integer that was on the top of the Stack
	 */
	public double pop()
	{
		double number = myList.pop();
		return number;
	}
	
	/**
	 * Try to pop a node from the top of the Stack
	 */
	public void processPop()
	{
		if(isEmpty() == false)
		{
			pop();
		}
		else
		{
			System.out.println("Stack is empty. No data available");
		}
	}
	
    /**
     * Check if list is empty
     * 
     * @return Boolean value indicating if stack is empty or not
     */
    public boolean isEmpty()
    {
    		if(myList.isEmpty() == true)
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    }
    
    /**
     * Print all data on the Stack
     */
    public void printStack()
    {
    		myList.printList();
    }
}