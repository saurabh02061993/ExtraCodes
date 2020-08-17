package Array;

public class pairSumwithRestArraySum {

	static void fun(int arr[], int n) {
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];

		}
		sum = sum / 2;

		int l = 0;
		int h = n - 1;

		if (n % 2 == 1) {
			System.out.println("no");
			return;
		}

		else {

			System.out.println(sum);
			System.out.println(l);
			System.out.println(h);
			while (l < h) {

				if (arr[l] + arr[h] > sum) {

					h--;
				} else if (arr[l] + arr[h] < sum) {
					l++;
					
				} else {
					System.out.println("Two elements are " + arr[l] + " and " + arr[h] + " ");
					break;

				}

			}

		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 4, 6, 9 };
		int n = a.length;
		fun(a, n);

	}

}
