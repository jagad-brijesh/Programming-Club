import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Brijesh Jagad
 * @version 1.0
 * 
 */

public class FibonacciSeries {

	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		
		int SIZE = 5;
		
		int a1=1;
		int a2=1;
		int temp;
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(SIZE > 0){
			temp=a1;
			a2=a1+a2;
			a1=temp;
			if(a1 >= n) {
				arr.add(a1);
				SIZE--;
			}
		}		
		System.out.println(arr.toString());
	}

}
