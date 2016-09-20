#include<stdio.h>

int main()
{
        int cost[]={1,2,4,8,16,32,64,128,256,512,1024,2048};
		int i=0,p=0,count=0;
		int test;
		scanf("%d",&test);
		while(--test>=0)
		{
			scanf("%d",&p);
			count=0;
			while(p>0)
			{
				for(i=0;i<11;i++)
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
