package practice_02_star_pattern;

public class full_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int j = 1; j <= rows - i; ++j) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	  }
	}
	



