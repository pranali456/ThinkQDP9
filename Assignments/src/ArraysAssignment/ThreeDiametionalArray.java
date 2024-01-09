package ArraysAssignment;

public class ThreeDiametionalArray {

	public static void main(String[] args) {
		int[][][] arr = { { { 1, 2, 3 }, { 2, 3, 4 } }, { { 4, 5, 6 }, { 1, 7, 8 }, } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println("arr[" +i+ "][" +j+"]["+k+ "] = "+arr[i][j][k] );

				}
				System.out.println();
			}
		}

	}

}
