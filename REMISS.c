#include<stdio.h>

int main()
{
    long int a,b;
    int test;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%ld%ld",&a,&b);
        if(a>b)
        {
            printf("\n%d %d",(a),(a+b));
        }
        else
            printf("\n%d %d",(b),(a+b));
    }
    return 0;
}
