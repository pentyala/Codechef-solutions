/*#include<stdio.h>

int main()
{
    int i,j,ch;
    char n[150];
    int res[150],num1[150],num2[150];
    res=init(res);
    num1=init(num1);
    num2=init(num2);
    printf("Program active\nEnter the numbers:\n");
    scanf("%s",n);
    scanf("%s",num2);
    while(1)
    {
        printf("Enter your choice\n1. Add\n2. Subtract\n3. Multiply\n4. Exit\n--->");
        scanf("%d",ch)
        switch(ch)
        {
        case 1:
            res=add(num1,num2);
            print(res);
            break;
        case 2:
            res=sub(num1,num2);
            print(res);
            break;
        case 3:
            res=mul(num1,num2);
            print(res);
            break;
        case 4:
            exit(0);
        default:
            printf("please select again:\n");
        }
    }
    return 0;
}

int[] cop(char[] ch)
{
    int i,r[150];
    r=init(r);
    for(i=0;i<150;i++)
    {
        r[i]=ch[i]-'0';
    }
}

int[] init(int[] a)
{
    int i=0;
    for(i;i<150;i++)
        a[i]=0;
}

int[] add(int[] num1,int[] num2)
{
    int res[150];
    res=init(res);
    for

}
int[] sub(int[] num1,int[] num2)
{

}
int[] mul(int[] num1,int[] num2)
{

}

int[] max(int[] num1,int[] num2)
{
    int i=0;
    for(i;i<150;i++)
    {
        if(num1[i]==num2[i])
            continue;
        else if(num1[i]>num2[i])
            return num1;
        else
            return num2;
    }
}
*/
#include<stdio.h>

int main()
{
    int a[]={1,3,5,7,9,11,13,15};
    int i,j,k;
    for(i=0;i<7;i++)
    {
        for(j=0;j<7;j++)
        {
            for(k=0;k<7;k++)
            {
                if(i==j||j==k||i==k)
                    ;
                else
                {
                    if((a[i]+a[j]+a[k])==30)
                        printf("\n%d  %d  %d\n",a[i],a[j],a[k]);
                }
            }
        }
    }
    return 0;
}
