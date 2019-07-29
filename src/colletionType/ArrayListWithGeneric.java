package colletionType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListWithGeneric {

	public static void main(String[] args) {
		 Collection <Integer> values = new ArrayList<>();
		 values.add(4);
		 values.add(56);
		 values.add(345);
		 values.add(45656);
		 values.add(45);
		 
		 values.remove(45);
		 
		 //to fetch the values from the ArrayList we have two ways
		 //By using Iterator with  next() method
		 //By using Iterator with while loop
		 //By using enhanced for loop 
		 
		 //*1 : Iterator with next() method
		
		
       
		//*2 : Iterator with while loop 
		 Iterator <Integer> it = values.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        
		 
		 //*3 : Enhanced for loop
		 
        for (Integer  i : values ) {
        	System.out.println(i);
        }
        
	}

}
