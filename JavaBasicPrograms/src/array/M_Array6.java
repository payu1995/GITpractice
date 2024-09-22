package array;

import java.util.Arrays;

public class M_Array6 {

public static void main(String[] args) {
		
		// declaring a source array
		char[] orgArray = { 'a', 'b','e', 'c', 'd'};
		//duplicate array
		char[] cloneArray= { 'a', 'b', 'c', 'd','e'};
		
		System.out.println(Arrays.equals(orgArray, cloneArray));//f
		Arrays.sort(cloneArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));//f
		Arrays.sort(orgArray);
		System.out.println(Arrays.equals(orgArray, cloneArray));// t
	}
}
/*
 * F5 --> to go inside the method/function
 * F6 --> next line
 * F8 --> continure the flow
 * ctrl+shft+i
 */
