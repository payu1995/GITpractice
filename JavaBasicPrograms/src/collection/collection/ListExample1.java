package collection.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample1 {

public static void main(String[] args) {
		
		//ArrayList l1=new ArrayList();
				//or
		List l2=new ArrayList();//runtime poly
		l2.add("Pune");//Object obj="Pune";--> upcasting
		l2.add(12);//Object obj=12; -->boxing --> upcasting
		l2.add(null);
		l2.add("Pune");
		System.out.println("List elements are: "+l2);
		l2.add(2, "Mango");
		System.out.println("List elements are: "+l2);
		System.out.println("List element count: "+l2.size());
		//System.out.println("List element at index 4: "+l2.get(4));
		
		l2.set(4, "Mumbai");
		System.out.println("updated,List elements are: "+l2);
		System.out.println("updated,List element count: "+l2.size());
		
		for(int i=0;i<l2.size();i++) {
			System.out.println("List element at index "+i+": "+l2.get(i));
		}
		System.out.println("********************using for each**************************");
		for(Object obj:l2) {
			System.out.println(obj);
		}
		System.out.println("********************using iterator**************************");
		/*
		 * Iterator: is an interface help us to iterate collection element one by one
		 * 			 it has 3 import methods
		 * 	hasNext(): boolean -> give true if next element is present else returns false
		 * 	next(): Object --> gives you the next element if present else gives exception as NoSuchElementException
		 * 	remove(): void --> helps to remove element from collection
		 * 
		 * NOTE: one iterator object can be use only once, for 2nd iteration you need to create new Iterator instance
		 */
		Iterator itr=l2.iterator();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//nosuchelementexception
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//false
		System.out.println("***************2nd iterator instance*****************");
		Iterator itr2=l2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
