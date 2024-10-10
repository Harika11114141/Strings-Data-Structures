import java.util.Arrays;
import java.util.Scanner;
public class anagrams {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		System.out.println("enter the second string");
		String str2 = sc.nextLine();
		
		boolean result = checkAnagram(str1, str2);
		if(result) {
			System.out.println("They are anagrams");
		}
		else {
			System.out.println("They are not anagrams");
		}
		sc.close();
	}
	public static boolean checkAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		else {
			char []arr1 = str1.toCharArray();
			char []arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			str1 = new String(arr1);
			str1 = new String(arr2);
			
			if(str1.equals(str2)) {
				return true;
			}
		}
		return false;
	}

}
