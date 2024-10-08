import java.util.Scanner;

public class occurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter  a string");
		String str1 = sc.nextLine();
        System.out.println("enter a character in given string");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("occurences are : " + count);
		sc.close();
	}

}
