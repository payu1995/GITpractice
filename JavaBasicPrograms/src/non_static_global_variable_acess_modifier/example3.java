package non_static_global_variable_acess_modifier;

public class example3 {
public static void main(String[] args) {
	example3 obj = new example3();
	obj.getPrimeNumber(25, 15);
}
public void getPrimeNumber(int start,int end) {
	System. out.println("prime number between "+ start+ " to"+ end);
	
	for(; start<=end; start++) {
		int ct = 0;
		for(int i =0; i<=start; i++) {
			
		if(start%i==0){
			ct++;
		}
	}
	if(ct==2) {
			System.out.println(" prime number is  :" + start);
		
	}
	}
}
}


	

