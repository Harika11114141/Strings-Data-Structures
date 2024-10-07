class StringExample1 {
	public static void main(String[] args) {
		String str1 = "Harika";
		String str2 = "Harika";
		String str3 = new String("Jeeva");
		String str4 = new String("Jeeva");
		if(str1==str2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("references are not equal");
		}
		if(str1.equals(str2)) {
			System.out.println("stringsare equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		if(str3 == str4) {
			System.out.println("using new operator ,references are equal");
		}
		else {
			System.out.println("using new operator ,references are not equal");
		}
		if(str3.equals(str4)) {
			System.out.println("using new operator, Strings are equal");
		}
		else {
			System.out.println("using new operator,strings are not equal");
		}
	}

}
