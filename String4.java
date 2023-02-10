
public class String4 {

	public static void main(String[] args) {
		
		String[] a= {"Hello","World"};
		String[] b= {"Welcome","to","java"};
		String[] s= {"class",null};
		
		C(a);
		C(b);
		C(s);
		
	}
	
	static void C(String[] arr) {
		String str= " ";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=null) {
				str=str.concat(arr[i]);
			}
			
		}
		System.out.print(str);
	}

}
