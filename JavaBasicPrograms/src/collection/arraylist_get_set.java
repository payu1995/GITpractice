package collection;

import java.util.ArrayList;

public class arraylist_get_set {

	public static void main(String[] args) {
		// The get() method returns the element at the specified index, whereas the set() method changes the element.

		 ArrayList<String> al=new ArrayList<String>();  
		  al.add("Mango");  
		  al.add("Apple");  
		  al.add("Banana");  
		  al.add("Grapes");  
		  //accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Dates");  
		  //Traversing list  
		  for(String fruit:al)    
		    System.out.println(fruit);    
		  
		 }  
		}  
