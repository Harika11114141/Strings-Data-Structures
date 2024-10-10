import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringFormatExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "columbs";
		int integer = 1230984567;
		float decimal = 23.7891f;
		System.out.printf("I remember one name in my mind it is %s name %n",str1);
		System.out.printf("And also rememeber one integer %15d %n", integer);
		System.out.printf("%s, %d.. %08f %n", str1,integer, decimal);
		System.out.printf("%20.8f %n", decimal);
		System.out.printf("%20.2f %n", decimal);
		System.out.printf("%20d %n", integer);
		//Apart that one easy way to formmated printing using String.format()
		String str2 = String.format("string is %s and integer is %d", str1,integer);
		System.out.println(str2);
		// DecimalFormat and SimpleDateFormat
		int number = 12345678;
		float decimalNum = 24.35f;
		System.out.println(String.format("Formatted number: %,d",number));
		System.out.println(String.format("Formatted floating point number: %2.8f", decimalNum));
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("E, MM-dd-yyyy");
		System.out.println(sdf.format(today));
		//current date
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Current time: " + time.format(today));

		sc.close();
	}

}