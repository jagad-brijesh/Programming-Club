import java.util.Scanner;

class Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=2^15,max=0,total=0,n;
		double avg;
		System.out.print("Enter Number:");
		n=sc.nextInt();
		int count=n;
		int temp;
		while(n>0){

			System.out.print("Enter number "+(count-n+1)+":");
			temp=sc.nextInt();

			if(temp<min){
				min = temp;
			}

			if(temp>max){
				max = temp;
			}

			total+=temp;

			n--;
		}
		avg= (double)total/count;

		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		System.out.println("Avg:"+avg);
	}
}	