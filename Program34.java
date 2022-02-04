import java.util.Scanner;

public class Program34 {
	
	public static void main(String[] args) {
		System.out.println("Enter three Number");
		Scanner sc = new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("The Number"+a+"is Greater");
			
		}
		else if(b>a && b>c) {
			System.out.println("The Number"+b+"is Greater");
		}
		else{
			System.out.println("The Number"+c+"is Greater");
		}
	}

}
