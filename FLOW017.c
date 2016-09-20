#include<stdio.h>

int main()
{
    int test,a,b,c;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%d",&a);
        scanf("%d",&b);
        scanf("%d",&c);
        if(((a-b>0)&&(a-c<0)))
            printf("\n%d",a);
        else if(b>c)
            printf("\n%d",b);
            else
                printf("\n%d",c);
           }
    return 0;
}
