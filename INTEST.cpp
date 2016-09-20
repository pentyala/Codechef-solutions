#include<iostream>
using namespace std;

int main()
{
	int n,k,count=0;
	cin>>n;
	cin>>k;
	while(--n>=0)
	{
		int temp=0;
		cin>>temp;
		if(temp%k==0)
			count++;
	}
	cout<<count;
}
