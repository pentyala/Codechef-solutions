#include<stdio.h>

int main()
{
    long int n,k,t;
    int count=0;
    scanf("%d",&n);
    scanf("%d",&k);
    while(--n>=0)
    {
        scanf("%ld",&t);
        if(t%k==0)
            count++;
    }
    printf("\n%d",count);
    return 0;
}
