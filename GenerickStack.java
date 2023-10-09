import java.lang.reflect.Array;

//This class creates a stack where you are asked to create the size beforhand.
//https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java reference for array creation
public class GenerickStack<E> 
{
	
   private E[] array;
   private E[] arrayDoubled;
   private int Size;
  
	
//constructor to creagte array of , we use final to initialize only when program goes to the line
    public GenerickStack(Class<E[]> class1, int size)
    {
    	
    	final E[] array = (E[]) Array.newInstance(class1, size);
    	this.array = array;
    	this.Size =0;
    	
    }

    public void push(E element)
    {
    	try {
		array[Size] = element;
		this.Size++;
    	}
    	catch(ArrayStoreException | ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Tried pushing an element not allowed in the stack");
    	}
    }
        
    

    public E pop() 
    {
    E object = null;
	   	try
	   	{
	   		object = array[Size-1]; // last item in array
	   	}
	   	catch(ArrayIndexOutOfBoundsException e)
	   	{
	   		
	   	}
	   this.Size--;
       return object;
    }
    

    public E peek()
    {
    	E value = null;
    	if (this.Size ==0)
    {
    		value= array[0];
    }
    	else if(this.Size >0)
    	{
        value= array[this.Size-1];
    	}
    else
    {
    	System.out.println("Array is empty");
    }
    	
    return value;
    	
    }

    public boolean isEmpty() 
    {
    	boolean bool;
        if(this.Size == 0)
        {
        System.out.println("Array is Empty");
        bool = true;
        }
        else 
        {
        bool = false;
        }
        return bool;
    }

    public String toString() 
    {
        return array.toString();
    }

    public int getSize()
    {
    	return Size;
    }
    
    public int getLength()
    {
    	return array.length;
    }

}
