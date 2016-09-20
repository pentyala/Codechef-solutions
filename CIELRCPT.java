import java.util.*;

class CIELRCPT
{
	public static void main(String[] args)
	{
		int[] cost={1,2,4,8,16,32,64,128,256,512,1024,2048};
		int i=0;
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(--test>=0)
		{
			int p=cin.nextInt();
			int count=0;
			while(p>0)
			{
				for(i=0;i<cost.length-1;i++)
				{
					if(cost[i+1]>p)
						break;
				}
				p=p-cost[i];
				count++;
			}
			if(p!=0)
			{
				System.out.println("Error");
				return;
			}
			System.out.println(count);
		}
	}
}