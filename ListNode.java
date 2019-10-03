/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 25/01/2018
 */
public class ListNode    
{
    // field to store the data being held in this list node (a number)
    private double number;
    
    // field to store a reference to the next node in the list after this one
    private ListNode next;
  

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set the number to default / empty value
        number = 0;

        // set next node to null - no valid next node yet
        next = null;
        
    }

    /**
     * Alternative constructor. Set fields to given values.
     *
     * @param number The number entered by user
     */
    public ListNode(double number)
    {
        // set number to values provided
        this.number = number;

        // set next node to null - no valid next node yet
        next = null;
    }


    /**
     * Get the number contained in this list node
     * 
     * @return The number
     */
    public double getNumber()
    {
        return number;
    }

    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNext()
    {
       // return your list node reference
    		return next;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param node A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNext(ListNode node)
    {
    		// store your list node reference
    		next = node;
    }

    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this list node
     */
    public String getSummaryData()
    {
        String data;		
        data = "Entered number " + number;		
        return data;
    }
}