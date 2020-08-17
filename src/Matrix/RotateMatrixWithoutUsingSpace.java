package Matrix;

public class RotateMatrixWithoutUsingSpace {

	static void m(int matrix1[][]) {
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {

				int temp = matrix1[i][j];
				matrix1[i][j] = matrix1[j][i];
				matrix1[j][i] = temp;
				System.out.print(matrix1[i][j] + " ");

			}
			System.out.println();

		}
	}

	static void transpose(int A[][]) {
		for (int i = 0; i < A.length; i++)
			for (int j = i + 1; j < A[0].length; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;

			}

	}

	static void print(int A[][]) {
		for (int i = 0; i < A.length; i++)
			for (int j = i + 1; j < A[0].length; j++) {
				System.out.println(A[i][j] + " ");
			}

	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int N = a.length;
		
		

		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < a[0].length - 1 - i; j++) {

				int temp = a[i][j];
				a[i][j] = a[N - 1 - j][i];
				a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
				a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
				a[j][N - 1 - i] = temp;

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println("============================================");
		// transpose(a);
		// print(a);

	}

}
