import java.util.*;

class LuckFour
{
	public static void main(String[] ar)
	{
		Scanner cin=new Scanner(System.in);
		int te=cin.nextInt();
		cin.nextLine();
		for(int test=0;test<te;test++)
		{
			int count=0,i=0;
			String asd="";
			asd=cin.nextLine();
			char[] ch=asd.toCharArray();
			for(i=0;i<ch.length;i++)
				if(ch[i]=='4')
					count++;
			System.out.println(count);
		}
	}
}