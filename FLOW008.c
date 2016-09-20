#include<stdio.h>

int main()
{
    int test,n;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%d",&n);
        if(n<10)
            printf("\nWhat an obedient servant you are!");
        else
            printf("\n-1");
    }
    return 0;
}
