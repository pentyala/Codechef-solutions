import java.util.*;
import java.lang.*;

public class TRICOIN
{
	public static void main(String[] args)
	{
		int test;
		Scanner cin=new Scanner(System.in);
		test=cin.nextInt();
		while(--test>=0)
		{
			double n=cin.nextDouble();
			double temp=(1+8*n);
			temp=Math.floor(Math.sqrt(temp));
			temp--;
			temp=Math.floor(temp/2);
			System.out.printf("%.0f",temp);;
		}
	}
}