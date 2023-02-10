import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String	str = sc.nextLine();
		
		replace(str);
		
		sc.close();
	
	}	
		
	static void replace(String s) {
		char[] ch=s.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < s.length()/2; i++) {
			
			ch[i]='X';
		}
		System.out.println(ch);
		
	}
		
}


