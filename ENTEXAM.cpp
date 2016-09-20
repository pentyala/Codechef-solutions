#include<iostream>

using namespace std;

int main()
{
    long int t,k,n,m,e;
    cin>>t;
    while(--t>=0)
    {
        cin>>n;
        cin>>k;
        cin>>e;
        cin>>m;
        long int marks[n-1];
        long int pe=0;
        for(int i=0;i<n-1;i++)
        {
         marks[i]=0;
        for(int j=0;j<e;j++)
        {
            //cout<<n<<"here"<<i<<"  :  "<<e<<"also"<<j;
            long int temp=0;
            cin>>temp;
            marks[i]+=temp;
        }
        }

        for(int i=0;i<e-1;i++)
        {
            //cout<<"kill me";
            long int temp=0;
            cin>>temp;
            pe+=temp;
        }
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1;j++)
                if(marks[i]>marks[j])
                {
                    long int te=marks[i];
                    marks[i]=marks[j];
                    marks[j]=te;
                }
              long int pass=marks[k-1];
              pass++;
              long int result=pass-pe;
              if(result>m)
                    cout<<"Impossible";
                    else
                    cout<<result<<endl;
    }
}
