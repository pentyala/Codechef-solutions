import java.lang.*;
import java.util.*;

class CHSPARR
{
	public static void main(String[] args)
	{	
		long t,m;
		int n,x,y;
		Scanner cin=new Scanner(System.in);
		t=cin.nextLong();
		while(--t>=0)
		{
			n=cin.nextInt();
			m=cin.nextLong();
			x=cin.nextInt();
			y=cin.nextInt();
			x--;
			y--;
			long[] ar=new long[n];
			for(int i=0;i<n;i++)
				ar[i]=cin.nextLong();
			while(--m>=0)
			{
				int temp=n+n-1;
				long[] te=new long[temp];
				for(int i=0,j=0;i<temp;i++)
				{
					if((i+1)%2!=0)
					{
						te[i]=ar[j];
						j++;
					}
					else
					{
						te[i]=ar[j]+ar[j-1];
					}
				}
				n=temp;
				ar=new long[n];
				for(int i=0;i<n;i++)
					ar[i]=te[i];
			}
			long result=0;
			int k=0;
			for(k=x;k<=y;k++)
				result+=ar[k];
			System.out.println(result);
		}
	}
}