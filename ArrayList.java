//this hw takes an arraylist, if duplicates are added, remove them and copy to nre list
public class ArrayList<E> 
{

	public static void main(String[] args)
	{
		//importing array list, dont know why but doesnt work with regular import java.util.ArrayList 
		java.util.ArrayList<Integer> list= new java.util.ArrayList<Integer>();
		 list.add(14);
		 list.add(24);
		 list.add(14);
		 list.add(42);
		 list.add(25);
		 
		 java.util.ArrayList<Integer> newList = removeDuplicates(list);
		 
		 System.out.print(newList);
		 }
	
		public static <E> java.util.ArrayList<E> removeDuplicates(java.util.ArrayList<E> list)
		{
			 java.util.ArrayList<E> RemovedList = new java.util.ArrayList<E>();
			
			 //Search each element in list and save to put in the newlist	
			for(E item : list)
			{
				if (RemovedList.contains(item))
				{
					System.out.println("integer already in list");
				}
				else
				{
					RemovedList.add(item);
				}
			}
		/* Your implementation here */
			return RemovedList;
		 }
}


