import java.util.Scanner;

public class GetInputFromUser {
	
	public static void main(String[] args) {
		int a;
		String b;
		float c;
            String aa; //Added from AA branch
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		b = sc.nextLine();
		
		System.out.println("String entered is: "+b);

		
		System.out.println("Enter a Float");
		
		c = sc.nextFloat();
		
		System.out.println("Float entered is: "+c);
		
		sc.close();
		
	}

}
