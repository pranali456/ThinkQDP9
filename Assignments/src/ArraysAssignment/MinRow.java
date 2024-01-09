package ArraysAssignment;

public class MinRow {
	public static void minRow(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int minRow = arr[i][0];

			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] < minRow) {
					minRow = arr[i][j];
				}
			}

			System.out.println("Maximum in row " + (i + 1) + ": " + minRow);
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 } };
		minRow(arr);

	}

}
