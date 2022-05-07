import java.util.Scanner;

class Power{

	static int mul(int a,int b){
		int sum=0;
		while(b>0){
			sum+=a;
			b--;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num,pow;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		num = sc.nextInt();

		System.out.print("Enter Power of given Number:");
		pow = sc.nextInt();
		int ans=1;

		while(pow>0){
			ans=mul(num,ans);
			pow--;
		}

		System.out.println(ans);
	}
}