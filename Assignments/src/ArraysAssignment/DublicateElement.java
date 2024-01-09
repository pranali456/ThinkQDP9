package ArraysAssignment;

import java.util.Arrays;

public class DublicateElement {
	public static void findDublicate(int ar[]) {
		int count = 0;
		boolean status;

		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					status = true;
					break;
				}
			}
			if (status == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k])
						count++;
				}
				if (count > 1)
					System.out.println(ar[i]);
			}
		}
	}

	public static void main(String[] args) {

		int ar[] = { 2, 5, 3, 7, 9, 2, 5, 9, 2 };

		System.out.println(Arrays.toString(ar));

		findDublicate(ar);

	}

}
