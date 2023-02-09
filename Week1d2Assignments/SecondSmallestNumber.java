package week.d2.Assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] arr = {23,45,67,32,89,22};
		Arrays.sort(arr);
		System.out.println("The second smallest number in the array is " + arr[1] + ".");
	}

}
