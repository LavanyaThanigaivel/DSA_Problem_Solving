import java.util.Scanner;
public class ReverseArray{
    public static void reverse(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:\n");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}