import java.util.Scanner;
public class Program39 {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
	int	k=1;
for(int i=n;i>=1;i--) {
	k=k*i;
}

System.out.println(k);
	}

}
