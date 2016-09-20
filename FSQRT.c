#include<stdio.h>
#include<math.h>

int main()
{
    int test,n;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%d",&n);
        n=(int)sqrt(n);
        printf("\n%d",n);
    }
    return 0;
}
