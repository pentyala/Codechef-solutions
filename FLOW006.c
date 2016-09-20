#include<stdio.h>

int main()
{
    long  int t;
    int sum=0,test;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%ld",&t);
        sum=0;
        while(t!=0)
        {
            sum=sum+(t%10);
            t=t/10;
        }
        printf("\n%d",sum);
    }
    return 0;
}
