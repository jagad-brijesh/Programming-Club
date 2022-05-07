import java.util.Scanner;

class DecimalToBinary{

	static String rev(String str){
		String reverse="";
		for (int i = str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		System.out.print("Enter number:");
		int num = new Scanner(System.in).nextInt();
		String Binary="";
		while(num>0){
			Binary += num%2;
			num/=2;
		}
		Binary = rev(Binary);
		System.out.print(Binary);

	}
}