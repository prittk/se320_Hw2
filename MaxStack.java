import java.util.Stack;
import java.lang.reflect.Array;
//https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java reference for array creation

public class MaxStack<E> {
	   private Stack<E> stack;
	   private E[] array;
	    private E[] arrayDoubled;
	    private int Size;
	  // Stack with a predetermined size of 10, final is used to create arrayone constructor is used
	    public MaxStack(Class<String[]> class1,int size)
	    {
	    	final E[] array = (E[]) Array.newInstance(class1,size); // create an area of objects with predetermined size 10
	    	this.array = array;
	    	this.Size = 0;
	        
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
	  	   		object = array[Size-1]; // last thing pushed at the end
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
