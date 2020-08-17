package Matrix;

public class Matrix {

	static void print(int A[][], int R, int C) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(A[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int R = A.length;
		int C = A[0].length;
		System.out.println("Original is *************");

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {

				System.out.print(A[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("************** transpose is *******************");

		for (int i = 0; i < R; i++) {
			for (int j = i + 1; j < C; j++) {

				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;

			}
		}
		print(A, R, C);

		System.out.println("****************rotate clock wise is**************");

		for (int i = 0; i < R; i++) {
			int k = 3;

			for (int j = i; j < k; j++) {

				int temp = A[i][j];
				A[i][j] = A[i][k];
				A[i][k] = temp;
				k--;

			}
		}

		print(A, R, C);

		System.out.println("****************rotate Anti clock wise is**************");

		for (int i = 0; i < R; i++) {
			int k = 3;

			for (int j = i; j < k; j++) {

				int temp = A[i][j];
				A[i][j] = A[k][i];
				A[k][i] = temp;
				k--;

			}

		}
		print(A, R, C);

	}
}
