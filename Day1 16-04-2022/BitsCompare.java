import java.util.Scanner;

class BitsCompare{
	
	static String rev(String str){
		String reverse="";
		for (int i = str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}


	static String BinaryToDecimal(int num){
		
		String Binary="";
		while(num>0){	
			Binary += num%2;
			num/=2;
		}
		Binary = rev(Binary);
		return Binary;
	}

	public static void main(String[] args) {

		System.out.print("Enter number 1:");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("Enter number 2:");
		int num2 = new Scanner(System.in).nextInt();


		int number1=Integer.parseInt(BinaryToDecimal(num1));
		int number2=Integer.parseInt(BinaryToDecimal(num2));

		int max = number1>=number2?number1:number2;
		int count=0;
		while(max>0){
			if((number1%10) != (number2%10))
				count++;
			number1/=10;
			number2/=10;
			max/=10;
		}

		System.out.print("No of bits to be changed : "+count);

	}

}