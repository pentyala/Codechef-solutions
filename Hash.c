///Hash Maps - Aditya (author)
#include<stdio.h>
#define max 100
#define null NULL
typedef struct structt
{
    char *data;
    struct structt *next;
}node;

void main()
{
    int i,ka,temp;
    char *str="";
    node* hash[max];
    node* t,*k;
    char kk;
    for(i=0;i<max;i++)
        hash[i]=null;
    printf("Hash initiated...\n");
    printf("Enter values to be stored in Hash (-1 to terminate)...\n");

    scanf("%s",str);

    printf("Hash initiated...\n");

    while(1)
    {
        if(str[0]!='\0'&&str[1]!='\0')
            if(str[0]=='-'&&str[1]=='1')
                break;
        i=0;
        temp=0;
        while(str[i]!='\0')
        {
            kk=str[i];
            ka=(int)kk;

            temp=temp+(int)(str[i]);
            i++;
        }
        temp=temp%max;
        t=(node *)sizeof(node *);
        t->data=str;
        t->next=null;
        k=hash[i];
        while(k->next!=null)
            k=k->next;
        k->next=t;
        scanf("%s",str);
    }
    t=hash[0];
    while(t!=null)
    {
        printf("%d\t\t%s\n",i,hash[i]->data);
        t=t->next;
    }
    //Printf("Enter the text to search now...\n");
    //scanf("%[^\n]",str);
}
