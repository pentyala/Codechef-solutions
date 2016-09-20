import java.lang.*;
import java.util.*;

class CHCOINSG
{
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int t,n;
		t=cin.nextInt();
		while(--t>=0)
		{
			flag=0;
			n=cin.nextInt();
			System.out.println(prob(n));
		}
	}
	static int flag=0;
	public static int nextPrime(int a)
	{
		if(a==0)
			return 1;
		int count=0;
		a++;
		while(true)
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
					count++;
			}
			if(count==0)
				break;
			else
				a++;
		}
		return a;
	}
	public static int prevPrime(int a)
	{
		int count=0;
		if(a<=2)
			return 1;
		a--;
		while(true)
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
					count++;
			}
			if(count==0)
				break;
			else
				a--;
		}
		return a;
	}
	public static String prob(int n)
	{
		if(n==0)
		{
			if(flag==1)
				return flag+"Misha";
			else
				return flag+"Chef";
		}
		int i=0;
		i=nextPrime(i);
		while((i*i*i)<n)
		{
			//System.out.println((i*i*i)+"   "+n);
			i=nextPrime(i);
		}
		i=prevPrime(i);
		n=n-(i*i*i);
		if(flag==0)
			flag=1;
		else
			flag=0;
		System.out.println(flag+"    "+n);
		return prob(n);
	}
}