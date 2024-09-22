
package practice_01_for_loop_program;

public class palindrom_program {

	public static void main(String[] args) {
		
		  int i,sum=0,temp;    
		  int n=545;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   i=n%10;  //getting remainder  
		   sum=(sum*10)+i;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		 
	}


