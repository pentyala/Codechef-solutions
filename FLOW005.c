#include<stdio.h>

int main()
{
        int cost[]={1,2,5,10,50,100};
		int i=0,p=0,count=0;
		int test;
		scanf("%d",&test);
		while(--test>=0)
		{
			scanf("%d",&p);
			count=0;
			while(p>0)
			{
				for(i=0;i<5;i++)
				{
					if(cost[i+1]>p)
						break;
				}
				p=p-cost[i];
				count++;
			}
			printf("\n%d",count);
		}

    return 0;
}
