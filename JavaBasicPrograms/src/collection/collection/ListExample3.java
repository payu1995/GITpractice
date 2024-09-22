package collection.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

public static void main(String[] args) {
		
		//ArrayList l1=new ArrayList();
				//or
		List l1=new ArrayList();//runtime poly
		l1.add("Mango");//Object obj="Pune";--> upcasting
		l1.add(true);//Object obj=12; -->boxing --> upcasting
		l1.add(123);
		l1.add('A');
		System.out.println("List1 elements are: "+l1);
		
		System.out.println("****************Generic Collection******************");
		List<String> l2=new ArrayList<String>();
		l2.add("Pune");
		l2.add("Mumbai");
		//l2.add(123);//compile time error for storing other then String object
		
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(25);
		l3.add(102);
		//l3.add('c');//compile time error for storing other then Integer object
		
		List<Character> l4=new ArrayList<Character>();
		l4.add('A');
		
		List<Boolean> l5=new ArrayList<Boolean>();
		l5.add(true);
		
		List<ListExample3> l6=new ArrayList<ListExample3>();
		l6.add(new ListExample3());
	}
	
}
