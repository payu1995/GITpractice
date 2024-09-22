package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist_iterater_using_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  //Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next());//printing the element and move to next  
		  }  
		 }  
		}  