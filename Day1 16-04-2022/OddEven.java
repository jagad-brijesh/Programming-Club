import java.util.Scanner;

class OddEven{
	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number:");
		num = sc.nextInt();

		while(num > 0){
			num -= 2;
		}

		if(num == 0){
			System.out.println("Entered Number is Even.");
		}else{
			System.out.println("Entered Number is Odd.");
		}
	}
}