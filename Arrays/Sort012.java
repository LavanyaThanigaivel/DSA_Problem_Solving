import java.util.*;
public class Sort012
{
    public static void sort012(int[] arr)
    {
        int n=arr.length-1;
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(mid<=right)
        {
            if(arr[mid]==0)
            {
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                
                left++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                
                right--;
            }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		sort012(arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}