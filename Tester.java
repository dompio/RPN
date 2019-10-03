/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 28/01/2018
 */
public class Tester 
{
	private Stack myStack;

    /**
     * Default constructor. Initialize fields to default values
     */
	public Tester()
	{
		myStack = new Stack();
	}
	
	/**
	 * Method to process automated tests of the Stack
	 */
	public void stackAutoTest()
	{
		//pop a node from an empty Stack
		System.out.println("Pop a node from an empty stack:");
		myStack.processPop();
		
		//push and pop a node
		System.out.println("Push and pop a node:");
		myStack.push(78);
		System.out.println(myStack.pop());
		
		//push multiple nodes and display the content
		System.out.println("Push multiple nodes and display the content:");
		myStack.push(2);
		myStack.push(36);
		myStack.push(778);
		
		myStack.printStack();		
	}
	
}