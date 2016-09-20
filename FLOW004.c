#include<stdio.h>

int main()
{
    int test,i,j,k;
    char n[50];
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%s",n);
        i=n[0];
        j=0;
        k=0;
        while(n[j]!='\0')
            {
                k++;
                j++;
            }
        j=n[k-1];
        printf("\n%d",((i-'0')+(j-'0')));
    }
    return 0;
}
