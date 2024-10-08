// Approach
// String will be convert into character array by using ‘toCharArray()’.
// Create one string array as the same length.
// Copy the content from one character array to another character array in reverse order.
// Covert array back to string

import java.util.Scanner;
public class ReverseTheString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any string");
		String str1 = sc.nextLine();
		
		System.out.println("Before Reversing");
		System.out.println(str1);
		
		System.out.println("After Reversing");
		char arr1[] = str1.toCharArray();
		char arr2[] = new char[str1.length()];
		int j = arr2.length-1;
		for(int i = 0; i <= arr1.length-1; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		String str2 = new String(arr2);
		System.out.println(str2);
		sc.close();
	}
}