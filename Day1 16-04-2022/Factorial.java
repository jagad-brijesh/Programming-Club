import java.util.Scanner;

class Factorial{

	static int mul(int a,int b){
		int sum=0;
		while(b>0){
			sum+=a;
			b--;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		num = sc.nextInt();

		int i,j,fact=1;

		for(i=1;i<num;i++){
			fact += mul(i,fact);
		}

		System.out.println(fact);
	}
}