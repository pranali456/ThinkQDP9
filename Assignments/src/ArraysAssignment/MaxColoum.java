package ArraysAssignment;

public class MaxColoum {
	public static void minColumn(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;

		for (int j = 0; j < cols; j++) {
			int minColumn = arr[0][j];

			for (int i = 1; i < rows; i++) {
				if (arr[i][j] > minColumn) {
					minColumn = arr[i][j];
				}
			}

			System.out.println("Minimum in column " + (j + 1) + ": " + minColumn);
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 } };
		minColumn(arr);
	}
}


