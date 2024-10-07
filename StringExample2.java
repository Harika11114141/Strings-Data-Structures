public class StringExample2{
	public static void main(String[] args) {
		String s1 = "krishna";
		String s2 = "Rahda";
		String s3 = s1+s2;
		String s4 = s1+s2;
		String s5 = "Radha" + "Krishna";
		String s6 = "Radha" + "Krishna";
		if(s3==s4) {
			System.out.println("s3 and s4 References are equal");
		}
		else {
			System.out.println("s3 and s4 references are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("s3 and s4 Strings are equal");
		}
		else { 
			System.out.println("s3 and s4 Strings are not equal");
		}
		if(s5==s6) {
			System.out.println("s5 and s6 eferences are equal");
		}
		else {
			System.out.println("s5 and s6 references are not equal");
		}
		if(s5.equals(s6)) {
			System.out.println("s5 and s6 are equal");
		}
		else {
			System.out.println("s5 and s6 are not equal");
		}
		
	}

}
