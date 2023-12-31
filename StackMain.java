import java.util.Scanner;
// This program creates two stacks form two different constructors, one  with a pre determined size the other with a defined size by user.
public class StackMain<E> {
	
	public static GenerickStack<String> CustStack;
	public static GenerickStack<String> CustStackDoubled;
	public static MaxStack MaxStack;
	public static MaxStack MaxStackDoubled;
	public static Scanner scan;
	
	public static void main(String[] args)
	{
	
int stackSize=0;
		//get size of new array for constructor
		System.out.println("What size should the cutom stack be?");
		scan = new Scanner(System.in);
		try
		{
		stackSize = scan.nextInt();
		}
		catch (java.util.InputMismatchException e)
		{
			
		}
		CustStack = new GenerickStack<String>(String[].class,0);
		
		MaxStack = new MaxStack<String>(String[].class, 10);
	

		
		System.out.println(""+CustStack.toString());
	}
	

	//Check if stack is full, if stack is full create a new stack
	public void pushToGenerick(String obj)
	{
		if(CustStack.getSize() >= CustStack.getLength())
		{
			System.out.println("Stack is full");
			
			CustStackDoubled = new GenerickStack(Object[].class, (CustStack.getLength()*2));
			
			for (int i=0; i<CustStack.getSize();i++)
			{	
				CustStackDoubled.push(CustStack.pop());
			}
		}
		else
		{
	CustStack.push(obj);
		}
		
	CustStack.toString();
	}
	// same as pushToGeneric
	public void pushToMax(String obj)
	{
		if(MaxStack.getSize() >= MaxStack.getLength())
		{
			System.out.println("Stack is full");
			
			MaxStackDoubled = new MaxStack(Object[].class, (MaxStack.getLength()*2));
			
			for (int i=0; i<CustStack.getSize();i++)
			{	
				MaxStackDoubled.push(CustStack.pop());
			}
	}
}
}
