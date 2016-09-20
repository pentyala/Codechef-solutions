#include<stdio.h>

int main()
{
    int i,test,count;
    char str[20];
    scanf("%d",&test);
    while(--test>=0)
    {
        count=0;
        scanf("%s",&str);
        i=0;
        while(str[i]!='\0')
        {
            if(str[i]=='4')
                count++;
                i++;
        }
        printf("\n%d",count);
    }
    return 0;
}
