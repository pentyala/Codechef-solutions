#include<stdio.h>
#include<math.h>

int main()
{
    int test,b,l,max,min,i;
    float max1,min1;
    scanf("%d",&test);
    while(--test>=0)
    {
        scanf("%d%d",&b,&l);
        max=b*b+l*l;
        min=abs(b*b-l*l);
        max1=(float)sqrt(max);
        min1=(float)sqrt(min);
        printf("\n%6f %6f\n",min1,max1);
    }
    return 0;
}
