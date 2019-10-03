/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 28/01/2018
 */
public class List 
{
    private ListNode head; // used to hold a reference to an instance of a ListNode object
    // which will be the first item in the list, i.e. at the 'head'
    // of the list

    /**
     * Default constructor. Initialise fields to default values.
     */
    public List()
    {
        // set the list to be empty, i.e. not referring to anything valid yet
        head = null;
    }

    /**
     * Get the list node which is at the 'head' of the list
     * 
     * @return A reference to a ListNode object which represents the node at the
     *         head of the list (or null if the list is empty, i.e. no 'head' has
     *         been set yet).    
     */
    public ListNode getHead()
    {
        return head;
    }

    /**
     * Set the 'head' of the list to the given node
     * 
     * @param  newHead A reference to a ListNode object which will be
     *                 the head of the list. 
     *                 
     * NOTE: if a list already exists, the existing listing will be 
     * lost since the head is being assigned to something new.
     */
    public void setHead(ListNode newHead)
    {
        head = newHead;
    }

    /**
     * Add a new node to the start of the list which will contain
     * the data provided (a number).
     * 
     * @param number The number entered  by user
     */
    public void push(double number)
    {
    		ListNode newNode = new ListNode(number);
    		newNode.setNext(head);
    		head = newNode;
    }

    /**
     * Print all the nodes in the List
     */
    public void printList()
    {
    		ListNode nextNode = null;
    		nextNode = head;
    		
    		do
    		{
        		System.out.println(nextNode.getNumber());
        		nextNode = nextNode.getNext();
    		}while(nextNode!=null);
    		
    		System.out.println(" ");
    }
    
    /**
     * Delete a node from the start of the List
     * 
     * @return A number of the type double
     */
    public double pop()
    {
		ListNode current = head;
    		
		double number = current.getNumber();
	   	head = current.getNext();
	    return number;
    }
    
    /**
     * Check if list is empty
     * 
     * @return Boolean value indicating if list is empty or not
     */
    public boolean isEmpty()
    {
		if (head == null)
		{
			//System.out.println("List is empty.");
			return true;
		}
		else
		{
			return false;
		}
    }
}