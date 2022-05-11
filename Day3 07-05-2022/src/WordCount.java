/**
 * Author : Jagad Brijesh 
 * Defination: Given a String count words,characters,and numbers and print the count.
 * 
 */
import java.util.Scanner;

class WordCount{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str= sc.nextLine();
		str=str.trim();
		int word;
		int space;
		int number=0;

		word = str.split(" ").length;
		space = word-1;
		for (char c : str.toCharArray()) {
			if((c>='0') && (c<='9')){
				number++;
			}
		}

		System.out.println("words:"+word);
		System.out.println("space:"+space);
		System.out.println("number:"+number);

	}
}