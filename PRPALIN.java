import java.util.*;

public class PRPALIN
{
	public static void main(String[] args)
	{
		int n=0;
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		int i;
		i=n;
		while(i<=1000000)
		{
			if(pal(i))
			{
				if(pri(i))
				{
					System.out.println(i);
					break;
				}
			}
			i++;
		}
	}
	static boolean pal(int i)
	{
		int temp=i,res=0;
		while(i!=0)
		{
			res=res*10+i%10;
			i=i/10;
		}
		if(temp==res)
			return true;
		return false;
	}

	static boolean pri(int i)
	{
		int count=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==0)
			return true;
		return false;
	}
}