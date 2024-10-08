public class FunctionsExample2 {
	public static void main(String[] args) {
		String str = new String("Tirumala");
		//using intern Method to copy the string from heap to ouside of the string pool
		String str1 = str.intern();
		System.out.println(str1);
		System.out.println(str);
		//comparing the strings character by character & return the amongst 2 strings is greater
		String str2 = "Gopi Krishna";
		String str3 = "Harika";
		if(str2.compareTo(str3)>0) {
			System.out.println("String 3 " + str2 +" is greater ");
		}
		else if(str2.compareTo(str3)<0) {
			System.out.println("String 4 " + str3 + " is greater");
		}
		else {
			System.out.println("Both strings are equal");
		}
		//covert character into array
		String str4 = "Harika";
		char str5[] = str4.toCharArray();
		for(char c : str5) 
		{
		System.out.print(c + " ");
		}
		System.out.println();
		//using split(), split the string in particular character or string regular expression
		String str6 = "I'm learning DSA concepts";
		//String str7[] = str6.split("a");
		//String str7[] = str6.split("e");
		String str7[] = str6.split("c");
		for(String c : str7) {
		System.out.println(c);
		}
		
		
	}
}
