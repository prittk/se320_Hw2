import java.util.InputMismatchException;
import java.util.Scanner;


//this program tests the assertion call to check if a number is between 0 and 10,
// you must activate assertionto use the program, in ecliple its under the arguments tab in the 
// VM arguments type -ea, or running from consol type -ea before the file java -ea UserAssert
public class UserAssert {
	
	
	public static void main(String[] args)
	{
		
	
	System.out.println("Enter a number between 0 and 10");
	
	Scanner scan = new Scanner(System.in);
	int range = 0;
	try
	{
	range = scan.nextInt();
	assert (range >=0 && range<= 10) : "The number is out of range"; //check is values is between 0 and 10 including 0 and 10, throws error if outside
																
	}
	catch (InputMismatchException e)
	{	
	}
	

	System.out.println(""+range);
	
	}

	
}
