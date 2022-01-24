import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of elements of first array: ");
		int n1 = in.nextInt();
		System.out.println("Enter your elements: ");
		int arr1[] = new int[n1];
		for(int i = 0; i < n1; i++)
		    arr1[i] = in.nextInt();
		System.out.println("Enter the no. of elements of second array: ");
		int n2 = in.nextInt();
		System.out.println("Enter your elements: ");
		int arr2[] = new int[n2];
		for(int i = 0; i < n2; i++)
		    arr2[i] = in.nextInt();
		int arr3[] = new int[n1 + n2];
 		int median = findMidean(arr1, arr2, arr3, n1, n2);
 		System.out.println("Median of both sorted arrays is: " + median);
	}	
	public static int findMidean(int arr1[], int arr2[], int arr3[], int n1, int n2)
	{
	    int total = n1 + n2;
		int i = 0;
		int j = 0;
		while(i < n1 && j < n1)
		{
		        arr3[i] = arr1[j];
		        j++;
		        i++;
		}
		int k = i;
		int l = 0;
		while(k < total && l < n2)
		{
		    arr3[k] = arr2[l];
		    k++;
		    l++;
		}
		Arrays.sort(arr3);
// 		System.out.println("-----------------------");
// 		for(int f = 0; f < total; f++)
// 		    System.out.println(arr3[f]);
// 		System.out.println("-----------------------");
		int median1 = 0;
		int median2 = 0;
		if(total % 2 == 0)
		{
		    median1 = total / 2;
		    median2 = median1 + 1;
		    return (((arr3[median1-1] + arr3[median2-1])/2)+ 1);
		}
		else
		{
		    median1 = total / 2 + 1;
		    return arr3[median1-1];
		}
	}
}
