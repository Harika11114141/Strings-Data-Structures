public class StringExample3 {
	public static void main(String[] args) {
		String str1 = "Saara";
		String str2 = str1;
		System.out.println(str1);
		System.out.println(str2);
		if(str1 == str2) {
			System.out.println("references are equal");
		}
		else {
			System.out.println("references are not equal");
		}
		if(str1.equals(str2) ) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("references are not equal");
		}
		//cloned when tierd to mutate
		String str3 = "String";
		System.out.println(str3);
		String str4 = str3.concat(" Data Structures");
		System.out.println(str3);
		System.out.println(str4);
	}
}
