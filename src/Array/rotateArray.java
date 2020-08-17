package Array;

public class rotateArray {

	static void reverse(int arr[], int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			

		}

	}

	static void rotateByK(int arr[], int len, int k) {
		reverse(arr, len -2, len);
		reverse(arr, 0, len-3);
		reverse(arr,0,len);
		
		for(int h:arr) {
			System.out.print(h+" "); 
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 11, 22, 33, 5, 6 };
		int len = arr.length-1;
		int k = 3;
		rotateByK(arr, len, k);
	}

}
