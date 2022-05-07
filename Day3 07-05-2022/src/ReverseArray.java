/**
 * Author : Jagad Brijesh
 * Date : 07/06/2022
 * Defination: WAP to reverse an array in the same array, without creating new array (Without using 'util' in Java) 
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static void reverse(int[] a) {
		int num = a.length;
		int temp;
		for(int i=0;i<num/2;i++) {
			temp = a[num-1-i];
			a[num-1-i]=a[i];
			a[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		reverse(a);
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
