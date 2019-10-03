import java.util.Scanner;

/**
 * AC12001 Lab 2 Stacks: Reverse Polish Notation
 * 
 * @author Dominika Piosik, School of Computing, University of Dundee
 *         
 * @version 28/01/2018
 */
public class RPNTester 
{
	RPNCalculator myRPN;
	
    /**
     * Default constructor. Initialize fields to default values
     */
	public RPNTester()
	{
		myRPN = new RPNCalculator();
	}
	
	/**
     * Display the options available in Menu
     */  
    public void displayMenu()
    {
    		System.out.println("===========================================");
    		System.out.println("MENU");
    		System.out.println("Choose 1 to display instructions.");
    		System.out.println("Choose 2 to calculate.");
    		System.out.println("Choose 3 to run automated tests of the Stack and the RPN Calculator.");
    		System.out.println("Choose 0 to exit." + "\n");   	
    		System.out.println("===========================================");
    }
    
    /**
     * Execute methods corresponding to the options available in the menu
     */  
    public void executeMenu()
    {
        while(true)
        {
                displayMenu();
                System.out.println("Choose the number from the menu: ");
                Scanner s2 = new Scanner(System.in);
                String usersChoice = s2.nextLine();
                
                switch(usersChoice)
                {
                		case "1":
                			displayInstructions();
                			break;
                		case "2":
                			calculate(enterExpression(), enterDelimiter());
                			break;
                		case "3":
                			runAutomatedTests();
                			break;
        				case "0":
        					System.exit(0);
        					break;	
        				default:
        					System.out.println("Choice not found. Try again." + "\n");
        					break;
                }
        }
    }
    
    /**
     * Display instructions how to use the RPN calculator
     */
	public void displayInstructions()
	{
		System.out.println("In order to use the RPN Calculator, please follow the instructions below:");
		System.out.println(" ");
		System.out.println("First, choose option 2. from the main menu to calculate the result of an expression.");
		System.out.println("When prompted, enter an expression in postfix notation using a delimiting character such as a comma (,) or a space ( ).");
		System.out.println(" ");
		System.out.println("The expression in postfix notation is an expression in the following form: 3,7,2,*,+,5,- (In the example a comma was used as a delimiter).");
		System.out.println("It is processed as [3+(7*2)]-5 = 12.");
		System.out.println(" ");
		System.out.println("When prompted, enter the delimiting character used in the postfix expression.");
		System.out.println("The result or an error message should immediately appear on screen.");
	}
	
	/**
	 * Receive as user input an RPN expression to evaluate
	 * 
	 * @return Full expression in the RPN to evaluate
	 */
	public String enterExpression()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the complete expression to evaluate: ");
		String expression = s1.nextLine();
		return expression;
	}
	
	/**
	 * Receive as user input a delimiting character used in the expression to evaluate
	 * 
	 * @return delimiting character
	 */
	public String enterDelimiter()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the delimiter used in the expression to evaluate: ");
		String delimiter = s1.nextLine();
		return delimiter;
	}
	
	/**
	 * Process calculation
	 * 
	 * @param expression the expression to evaluate provided by user
	 * @param delimiter the delimiting character used in the expression to evaluate
	 */
	public void calculate(String expression, String delimiter)
	{
		if(myRPN.evaluateRPN(expression, delimiter) == true)
		{
			myRPN.display();
		}
		else
		{
			System.out.println("Invalid expression entered, please try again. You will be redirected to the main menu.");
		}
	}
	
	/**
	 * Run automated tests
	 */
	public void runAutomatedTests()
	{
		Tester newTester = new Tester();
		newTester.stackAutoTest();
		
		calculate("4,6,+", ",");
		calculate("8,2,-", ",");
		calculate("5,7,-", ",");
		calculate("3,9,*", ",");
		calculate("9,3,/", ",");
		calculate("9,0,/", ",");
		calculate("3,7,2,*,+,5,-", ",");
		calculate("12,2,3,4,*,10,5,/,+,*,+", ",");

		calculate("ffff,2,+", ",");
		calculate("randomtext", ",");
		calculate("4,6,2,+", ",");
		calculate("4,+", ",");
		calculate("6", ",");
		calculate("6,", ",");
		calculate("", ",");
		calculate("4,6,+", ".");
		calculate("4,6,+", "2");
		calculate("4,6,+", "d");
	}
	
	/**
	 * Main method
	 * 
	 * @param args Standard input parameters of the type String
	 */
	public static void main(String[] args) 
	{
		RPNTester myTester = new RPNTester();
		myTester.displayInstructions();
		myTester.executeMenu();
	}
}
