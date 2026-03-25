import java.util.*;
public class UnionIntersection
{
    public static List<Integer> Union(int[] a,int[] b)
    {
        List<Integer> result=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                result.add(a[i]);
                i++;
            }
            else if(a[i]>b[j])
            {
                result.add(b[j]);
                j++;
            }
            else
            {
                result.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length)
            {
                if(i==0 || a[i]!=a[i-1])
                {
                    result.add(a[i]);
                  
                }
		i++;
            }
        while(j<b.length)
            {
                if(j==0 || b[j]!=b[j-1])
                {
                    result.add(b[j]);
              
                }
		j++;
            }
        return result;
    }
    public static List<Integer> Intersection(int[] a,int[] b)
    {
        List<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                i++;
            }
            else if(a[i]>b[j])
            {
                j++;
            }
            else
            {
                res.add(a[i]);
                i++;
                j++;
            }
        }
        return res;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		System.out.println("Enter array1 elements:");
		for(int i=0;i<n;i++)
		{
		    arr1[i]=sc.nextInt();
		}
		System.out.println("Enter m:");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		System.out.println("Enter array2 elements:");
		for(int i=0;i<m;i++)
		{
		    arr2[i]=sc.nextInt();
		}
		System.out.print("Union: "+Union(arr1,arr2));
		System.out.print("Intersection: "+Intersection(arr1,arr2));
	}
}