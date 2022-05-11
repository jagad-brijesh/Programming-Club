import java.util.*;

class subArray
{
	static void allSubset(String arr[], int n) 
	{ 
	    int subset_size = (int)Math.pow(2, n);
	    int i, j;
	    ArrayList<ArrayList<String>> final_subset = new ArrayList<>();
	    for(i=1;i<subset_size;i++) 
	    {
	        ArrayList<String> subset = new ArrayList<>();
	        for(j=0;j<n;j++)
	        { 
	            // Check if jth bit in the i is set
	            // If set then add jth element to the subset
	            if((i & (1 << j)) != 0)
	                subset.add(arr[j]);
	        } 
	       	final_subset.add(subset);
	    }
	    System.out.print(final_subset);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Set:");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.print("Enter set elements:");
		for (int i=0;i<n ;i++ ) {
			arr[i] = sc.next();
		}
		allSubset(arr,n);
	}
}