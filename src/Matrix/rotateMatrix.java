package Matrix;

public class rotateMatrix {
	static void transpose(int A[][], int N) {

		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++) {
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
	}

	static void print(int A[][], int N) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(A[i][j] + " ");
			System.out.print("\n");
			
		}
		
	}

	static void clockwise(int B[][], int N) {
		System.out.println("clockwise rotation is: ");
		for (int i = 0; i < B.length; i++) {
			for (int j = B[0].length - 1; j >= 0; j--) {

				System.out.print(B[i][j] + " ");

			}
			System.out.println();

		}

	}

	static void Anticlockwise(int B[][], int N) {
		System.out.println("Anticlockwise rotation is: ");
		for (int i = B.length - 1; i >= 0; i--) {
			for (int j = B[0].length - 1; j >= 0; j--) {

				System.out.print(B[i][j] + " ");

			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		int A[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };

		int B[][] = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		System.out.println("******************************");
		System.out.println("Matrix before rotation: ");

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {

				System.out.print(B[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println("matrix after transpose :");
		transpose(B, B.length);
		print(B, B.length);

		transpose(A, A.length);
		print(A, A.length);
		System.out.println("***********clock***********");
		clockwise(A, A.length);
		clockwise(B, B.length);

		System.out.println("***********Anticlock***********");
		Anticlockwise(A, A.length);
		Anticlockwise(B, B.length);

	}

}
