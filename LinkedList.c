#include<stdio.h>
#include<stdlib.h>

typedef struct node
    {
        int val;
        struct node *next;
    }k;
int main()
{
    int n;
    struct node *temp,*start,*end;
    printf("program initiated... \n");
    printf("Please enter the values followed by -99...\n");
    scanf("%d",&n);
    start=(k *)malloc(sizeof(k *));
    start->val=n;
    start->next=NULL;
    end=start;
    while(1)
    {
        scanf("%d",&n);
        if(n==-99)
            break;
        temp=(k *)malloc(sizeof(k *));
        temp->val=n;
        end->next=temp;
        temp->next=NULL;
        end=temp;
    }
    printf("Done...\nEnter your choice:\n1. Display\n2. Exit\n");
    while(1)
    {
        scanf("%d",&n);
        if(n==2)
            return 0;
        if(n==1)
        {
            temp=start;
            while(temp!=NULL)
            {
                printf("%d     ",temp->val);
                temp=temp->next;
            }
        }
        else
        {
            printf("Invalid CHoice. Try Again...\n");
            continue;
        }
    }
}
