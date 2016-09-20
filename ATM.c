#include<stdio.h>

int main()
{
    int b,test,i;
    scanf("%d",&test);
    for(i=0;i<test;i++)
    {
        scanf("%d",&b);
        printf("%d",getsum(b));
    }
    return 0;
}

int getsum(int a)
{
    if(a<=1)
        return 0;
    int i=1,sum=0;
    if(a%2==0)
        a=a-2;
    else
        a=a-3;
        a=a/2;
    for(i=1;i<=a;i++)
        sum=sum+i;
    return sum;
}
