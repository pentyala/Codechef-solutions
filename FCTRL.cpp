#include<iostream>
using namespace std;

int main()
{
    int t,n;
    cin>>t;
    int count=0;
    while(--t>=0)
    {
        count=0;
        cin>>n;
        while(n!=0)
        {
            count=count+(n/5);
            n=n/5;
        }
        cout<<count<<endl;
    }
}
