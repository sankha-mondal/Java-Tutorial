import java.util.*;
class Array_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("The array elements are: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}