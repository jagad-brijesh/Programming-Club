import java.util.Scanner;

class Division{

	static int div(int a,int b){
		int ans=0;
		if(a<=b){
			return 0;
		}
		while(a>b){
			ans++;
			a-=b;
		}
		return ans;
	}

	static int remind(int a,int b){
		int ans=0;
		if(a<b){
			return a;
		}else if(a==b){
			return 0;
		}
		while(a>b){
			ans++;
			a-=b;
		}
		return a;
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:");
		a = sc.nextInt();

		System.out.print("Enter Power of given Number:");
		b = sc.nextInt();

		System.out.println("Quotient = "+div(a,b));

		System.out.println("reminder = "+remind(a,b));
	}
}