import java.util.Scanner;

/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 25/01/2018
 */
public class RPNCalculator 
{
	private Stack myStack;
	private double result;

    /**
     * Default constructor. Initialize fields to default values
     */
	public RPNCalculator()
	{
		myStack = new Stack();
		result = 0;
	}
	
	/**
	 * Evaluate an RPN expression and push it onto Stack
	 * 
	 * @param expression String with the expression to evaluate
	 * @param delimiter The delimiting character
	 * @return boolean value indicating if the calculation was processed successfully or not
	 */
	public boolean evaluateRPN(String expression, String delimiter)
	{
		String[] parts = expression.split(delimiter);
		
    	    	for(int i = 0; i < parts.length; i++)
	    	{    	    	
    	    		if(!parts[i].equals("+") && !parts[i].equals("-") && !parts[i].equals("*") && !parts[i].equals("/"))
    	    		{
    	    		
        	    		//Catching NumberFormatException https://beginnersbook.com/2013/04/exception-handling-examples/
        	    		//example code has been modified
        	    		try
        	    		{
        	    			myStack.push(Double.parseDouble(parts[i]));
        	    		}
        	    		catch(NumberFormatException e)
        	    		{
        	    		  	return false;
        	    		}
    	    		}
    	    		else
    	    		{
    	    			try
    	    			{
            	    		double second = myStack.pop();
            	    		double first = myStack.pop();

            	    		char operator = parts[i].charAt(0);
            	    		if(second == 0 && operator == '/')
            	    		{
            	    			System.out.println("Error: division by 0.");
            	    			return false;
            	    		}
            	    		else
            	    		{
                	    		myStack.push(calculate(first, second, operator));
            	    		}
    	    			}
    	    	        catch(NullPointerException e)
    	    	        {
    	    	            return false;
    	    	        }
    	    		}
	    	}
    	    	
    	    	try
    	    	{
        	    	result = myStack.pop();
    	    	}
    	     catch(NullPointerException e)
    	    {
    	        return false;
    	    }

    	    	if(myStack.isEmpty() == true)
    	    	{
        	    	return true;
    	    	}
    	    	else
    	    	{
    	    		while(myStack.isEmpty() == false)
    	    		{
    	    			myStack.pop();
    	    		}
    	    		return false;
    	    	}
	}
	
	/**
	 * Calculate the result of a particular expression
	 * 
	 * @param first The first number to perform calculation on
	 * @param second The second number to perform calculation on
	 * @param operator Determines the type of operation to perform
	 * @return The result of calculation
	 */
	public double calculate(double first, double second, char operator)
	{	
		switch(operator)
		{
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				result = first / second;
				break;
		}
		
		return result;
	}
	
	/**
	 * Display the final result
	 */
	public void display()
	{
		System.out.println("Result: " + result);
	}
}
