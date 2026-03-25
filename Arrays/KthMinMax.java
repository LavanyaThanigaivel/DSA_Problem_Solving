import java.util.*;
public class KthMinMax{
    
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
	       int[] arr=new int[n];
        System.out.println("Enter elements:");
	    for(int i=0;i<n;i++)
	    {
		    arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    System.out.println("Enter k:");
	    int k=sc.nextInt();
	    System.out.println("Kth min element is "+arr[k-1]);
	    System.out.println("Kth max element is "+arr[n-k]);
        sc.close();
    }
}