package colletionType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReview {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<>();
		values.add(345);
		values.add(45);
		values.add(23);
		values.add(45677);
		values.add(342);
		values.add(2);
		
		Collections.sort(values);   //sort(List<E>) is used to sort the integer from the smaller number to the bigger 
		
		System.out.println("Fetching the the values of the List By using forEach() method : ");
		values.forEach(System.out::println); //Stream API ..it uses Lamda Expression introduce from Java 1.8
		
		System.out.println("Fetching the values of the List by using the Enhaced for loop :");
		
		for(Integer i : values) {         
			System.out.println(i);
		}
	

	}

}
