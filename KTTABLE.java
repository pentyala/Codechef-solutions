import java.lang.*;
import java.util.*;

class KTTABLE
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		for(int tesst=0;tesst<test;tesst++)
		{
			int n=cin.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++)
				a[j]=cin.nextInt();
			int[] b=new int[n];
			for(int j=0;j<n;j++)
				b[j]=cin.nextInt();
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(i==0)
				{
					if((a[i]-0)>=b[i])
						count++;
				}
				else
				{
					if((a[i]-a[i-1]>=b[i]))
						count++;
				}
			}
			System.out.println(count);
		}
	}
}