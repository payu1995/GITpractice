package collection;

import java.util.ArrayList;

public class arraylist_for_eachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  //Traversing list through for-each loop  
		  for(String fruit:list)    
		    System.out.println(fruit);    
		  
		 }  
		}  