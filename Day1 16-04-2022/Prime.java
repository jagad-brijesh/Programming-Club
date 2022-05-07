import java.util.Scanner;

class Prime{

	static boolean check_prime(int n){
		boolean prime=true;

		if(n==0 || n==1){
			prime=true;
		}else{
			for (int i=2;i<=n/2;i++) {
				if(n%i==0){
					prime=false;
					break;
				}
			}
		}
		return prime;
	}
		

	public static void main(String[] args) {
		int start,end;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter starting numbers:");
		start=sc.nextInt();
		System.out.print("Enter ending numbers:");
		end=sc.nextInt();
		int n = start - end;
		int i = start;
		int flag = 0;
		do{
			if(check_prime(i)){
				System.out.print(i+", ");
			}
			i++;
		}while(i != end+1);

		System.out.print(" are prime numbers...");
	}
}