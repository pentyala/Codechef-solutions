import java.util.*;

class SIMPSTAT
{
	public static void main(String[] args)
	{
		int test;
		Scanner cin=new Scanner(System.in);
		test=cin.nextInt();
		while(--test>=0)
		{
			int n,k;
			n=cin.nextInt();
			k=cin.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=cin.nextInt();
			}
			sorta(a);
			for(int i=0;i<k;i++)
			{
				a[i]=0;
				a[n-i-1]=0;
			}
			int sum=0;
			for(int i=0;i<n;i++)
				sum+=a[i];
			float avg=(float)((float)sum/(float)(n-k-k));
			System.out.println(avg);
		}
	}

	public static void sorta(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}