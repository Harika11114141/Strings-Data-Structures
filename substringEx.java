import java.util.Scanner;
public class substringEx {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    printAllSubstrings(str);
    sc.close();
}
public  static void printAllSubstrings(String str) 
{
    for (int i = 0; i < str.length(); i++) 
    {
        for (int j = i + 1; j <= str.length(); j++) 
        {
            System.out.println(str.substring(i, j));
        }
    }
}
}



