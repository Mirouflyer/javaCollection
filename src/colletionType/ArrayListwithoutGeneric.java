package colletionType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



//Collection 1.2  ; Generic 1.5
//Dynamic Array 
public class ArrayListwithoutGeneric {

	public static void main(String[] args) {
	  
		
		 //We should follow the Type Safety and use the Generic concept but in order to just show the evolution of java 
		 // and definition of the ArrayList , The different way of  how to fetch the values from it .
		
		
		Collection values = new ArrayList();
		 values.add(4);
		 values.add("Elias");
		 values.add(56.45);
		 
		 //to fetch the values from the ArrayList we have two ways
		 //By using Iterator with while loop
		 //By using enhanced for loop 
		 
		
		
       
		//*1 : Iterator with while loop 
		 Iterator it = values.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        
		 
		 //*2 : Enhanced for loop
		 
        for (Object i : values ) {
        	System.out.println(i);
        }
        
	}

}
