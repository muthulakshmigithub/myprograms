import java.util.Scanner;
public class Program45 {
	
	public static void main(String[]args) {
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		 int n = a.nextInt();

		int i=0,num=n;
		while(num!=0) {
			num/=10;
			i++;
		}
		System.out.println("Number of digits: " +i);
	}

}
