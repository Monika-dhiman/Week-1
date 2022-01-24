import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
	        arr[i] = in.nextInt();
	    System.out.println("Enter sliding window size: ");
	    int k = in.nextInt();
	    int max = max(arr, n, k);
	   System.out.println("max: " + max);
	}
	public static int max(int arr[], int n, int k){
	    int left = 0;
	    int right = n - 1;
	    int max = 0;
	    for(int i = left; i < right; i++)
	    {
	        int sum = 0;
	        for(int j = 0; j < k; j++)
	        {
	            sum = sum + arr[i+j];
	            
	        }
	        if(sum >= max)
	            max = sum;
	    }
	   return max;
	}
}
