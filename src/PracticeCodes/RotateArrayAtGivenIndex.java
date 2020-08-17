package PracticeCodes;

public class RotateArrayAtGivenIndex {

	static int[] reverse(int k[], int low, int high) {

		while (low < high) {
			int temp = k[low];
			k[low] = k[high];
			k[high] = temp;
			low++;
			high--;

		}

		return k;

	}
//LeftRotate
	static void rotate(int[] k, int l, int h) {
		reverse(k, 0, l - 1);
		
		reverse(k, l, h - 1);
		
		reverse(k, 0, h - 1);
		for(int s:k) {
			System.out.print(s+" ");
		}

	}

	public static void main(String[] args) {
	
		//System.out.println(c);

		int k[] = { 1, 2, 3, 4, 5,6,7,8,9,10};
		
		
		int l = 3;
		int h = k.length;
		rotate(k, l, h);

	}
	


}
