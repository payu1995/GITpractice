package array;

public class jagged_3d_array {

	public static void main(String[] args) {

		int num[][] = new int[3][]; // jagged array 1 matrix is emty...
		num[0] = new int[3];
		num[1] = new int[4];
		num[2] = new int[2];

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j<num[i].length; j++) {

				//num[i][j] = (int) (math.random()*10);

				System.out.print(num[i][j]);
			}
			
		System.out.println();
	}
}
}
