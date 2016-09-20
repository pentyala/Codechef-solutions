#include<stdio.h>

int main()
{
    char s1[105],s2[105];
    int i,test,max,min,count;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%s",s1);
        scanf("%s",s2);
        i=0;
        count=max=min=0;
        while(s1[i]!='\0'||s2[i]!='\0')
        {

            if(s1[i]=='?'||s2[i]=='?')
            {
                count++;
            }
            else if (s1[i]!=s2[i])
            {
                max++;
                min++;
            }
            i++;
        }
        printf("\n%d %d",min,(min+count));
    }
    return 0;
}
