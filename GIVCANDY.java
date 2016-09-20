import java.util.*;
import java.lang.*;

class GIVCANDY
{
	public static void main(String[] args)
	{	
		int t;
		long a,b,c,d;
		Scanner cin=new Scanner(System.in);
		t=cin.nextInt();
		while(--t>=0)
		{
			a=cin.nextLong();
			b=cin.nextLong();
			c=cin.nextLong();
			d=cin.nextLong();
			long r=0,res=0,i=0;
			res=Math.abs(a-b);
			while(++i<10000)
			{
			//	System.out.println("asd");
				if(a>b)
				{
					b=b+d;
				}
				if(b>a)
				{
					a=a+c;
				}
				if(a==b)
				{
					res=0;
					break;
				}
				r=Math.abs(a-b);
				if(r<res)
					res=r;
				if(res==0)
					break;
			}
			System.out.println(res);
		}
	}
}