import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String	str = sc.nextLine();
		
		char[] strin=str.toCharArray();
		System.out.println("The string is:"+str);
		System.out.println("The duplicate characters are : ");
		
		
		for (int i = 0; i <str.length(); i++) 
			
			for (int j = i+1; j < str.length(); j++) {
				
				if(strin[i]==strin[j] ) {
					
					System.out.print(strin[j] +" ");
				}
			}
			
			sc.close();
		}
		

	}


