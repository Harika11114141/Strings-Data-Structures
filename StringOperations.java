public class StringOperations {
	public static void main(String[] args) {
		String str = "Hello everyone! Welcome to my GitHub repository";
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(9));
		System.out.println(str.substring(0,8));
		System.out.println(str.charAt(11));
		System.out.println(str.indexOf('W'));
		System.out.println(str.isEmpty());
		System.out.println(str.contains("everyone"));
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("repository"));
		System.out.println(str.endsWith("to"));
		System.out.println(str.replace('W', 'E'));
		System.out.println(str.replaceAll("Welcome", "Hoola"));
		System.out.println(str.length());	
	}

}
