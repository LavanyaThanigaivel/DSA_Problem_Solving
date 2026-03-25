import java.util.*;
public class MoveNegative
{
    public static void moveNegatives(int[] arr)
    {
        int n=arr.length-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            if(arr[left]<0)
            {
                left++;
            }
            else if(arr[right]>0)
            {
                right--;
            }
            else
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                
                left++;
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
		moveNegatives(arr);
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
}