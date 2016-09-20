import java.lang.*;
import java.util.*;

class MAKEART
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(--test>=0)
		{
			int n=cin.nextInt();
			int[] ar=new int[n];
			int[] temp=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=cin.nextInt();
				temp[i]=0;
			}
			for(int i=0;i<n-2;i++)
			{
				if(i==0)
				{
					temp[i]=ar[i];
					temp[i+1]=ar[i];
					temp[i+2]=ar[i];
				}
				else if(i==(n-3))
				{
					temp[i]=ar[i];
					temp[i+1]=ar[i];
					temp[i+2]=ar[i];	
				}
				else
				{
					temp[i+2]=ar[i];
					temp[i]=ar[i];
					temp[i+1]=ar[i];	
				}
			}
			int fa=0;
			for(int k=0;k<n;k++)
			{
				if(temp[k]!=ar[k])
				{
					int[] temp1=new int[n];
					for(int i=0;i<n;i++)
					{
						temp1[i]=ar[n-i-1];
						temp[i]=0;
					}
					for(int i=0;i<n-2;i++)
					{
						if(i==0)
						{
							temp[i]=temp1[i];
							temp[i+1]=temp1[i];
							temp[i+2]=temp1[i];
							}
						else if	(i==(n-3))
						{
							temp[i]=temp1[i];
							temp[i+1]=temp1[i];
							temp[i+2]=temp1[i];	
						}
						else
						{
							temp[i-1]=temp1[i];
							temp[i]=temp1[i];
							temp[i+1]=temp1[i];	
						}
					}
					for(int j=0;j<n;j++)
						if(temp[j]!=temp1[j])
						{
							fa=1;
							System.out.print("No");
							break;
						}
					if(fa==0)
					{
						System.out.print("Yes");
						fa=2;
						break;
					}
					break;
				}
			}
			if(fa==0)
				System.out.print("Yes");
		}
	}
}