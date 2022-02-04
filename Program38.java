import java.util.Scanner;
public class Program38 {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;  

		}
		
		System.out.println(sum);  

		
	}

}
