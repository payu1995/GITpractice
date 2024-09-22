package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

public static void main(String[] args) {
		
		//ArrayList l1=new ArrayList();
				//or
		List l1=new ArrayList();//runtime poly
		l1.add("Mango");//Object obj="Pune";--> upcasting
		l1.add("Banana");//Object obj=12; -->boxing --> upcasting
		l1.add("Apple");
		l1.add("Grapes");
		System.out.println("List1 elements are: "+l1);
		List l2=new ArrayList();//runtime poly
		l2.add("Pune");//Object obj="Pune";--> upcasting
		l2.add("Bangalore");//Object obj=12; -->boxing --> upcasting
		l2.add("Mumbai");
		l2.add("Delhi");
		System.out.println("List2 elements are: "+l2);
		
		l1.addAll(l2);//adding l2 elements into l1
		System.out.println("updated, List1 elements are: "+l1);
		
		l1.removeAll(l2);
		System.out.println("after removing l2 from l1. Updated, List1 elements are: "+l1);
		
		l1.addAll(2,l2);//adding l2 elements into l1
		System.out.println("Adding l2 in l1 index2. updated, List1 elements are: "+l1);
		
		l1.removeAll(l2);
		System.out.println("after removing l2 from l1. Updated, List1 elements are: "+l1);
		
	}
}
