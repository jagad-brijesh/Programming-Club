import java.util.Scanner;
import java.util.Hashtable;

class DecimalRoman{

	static final Hashtable<Character, Integer> ht;

    static{
    	ht = new Hashtable<Character, Integer>();
    
    	ht.put('i',1);
	    ht.put('x',10);
	    ht.put('c',100);
	    ht.put('m',1000);
	    ht.put('v',5);
	    ht.put('l',50);
	    ht.put('d',500);
    }

	public static int RomanToint(String num)
	{       
	    int intNum=0;
	    int prev = 0;
	    for(int i = num.length()-1; i>=0 ; i--)
	    {
            int temp = ht.get(num.charAt(i));
            if(temp < prev)
                intNum-=temp;
            else
                intNum+=temp;
            prev = temp;
	    }
	    return intNum;
	} 

	static String intToRoman(int num)
    {
        // storing roman values of digits from 0-9
        // when placed at different places
        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                       "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                       "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                       "V", "VI", "VII", "VIII", "IX" };
 
        // Converting to roman
        String thousands = m[num / 1000];
        String hundreds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];
 
        String ans = thousands + hundreds + tens + ones;
 
        return ans;
    }

	public static void main(String[] args) {
		
		int a=1599;
		String roman=intToRoman(1599);
		System.out.println(roman);
		
		String str=roman;
		str=str.toLowerCase();
		System.out.println(RomanToint(str));


	}
}