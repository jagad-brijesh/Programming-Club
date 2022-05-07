import java.util.Scanner;

class Subtraction{
	public static void main(String[] args) {
		int a,b;
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter num1:");
		a=sc.nextInt();

		System.out.print("Enter num2:");
		b=sc.nextInt();

		int ans=a+~b+1;

		System.out.print(ans);
	}
}