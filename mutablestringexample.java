public class mutablestringexample {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Saina");
		str.append(" Nehwal");
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("Chocolate");
		str1.append(" Flavour");
		System.out.println(str1);
		
		System.out.println("...........");
		StringBuffer  str2 = new StringBuffer();
		//initially capacity will be 16
		System.out.println(str1.capacity()); // 25
		System.out.println(str.capacity());  // 21
		
		System.out.println(str2.capacity()); // 16
		str2.append("And aslo Pistha flavour");
		System.out.println(str2.capacity());  // 34
		
		StringBuffer str3 = new StringBuffer();
		str3.ensureCapacity(200);
		System.out.println(str3.capacity());	
	}

}