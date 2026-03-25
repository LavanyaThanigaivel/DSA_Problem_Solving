import java.util.Scanner;
public class Min_Max{
    public static void minmax(int[] arr)
    {
        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
    }
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
	minmax(arr);
        sc.close();
    }
}