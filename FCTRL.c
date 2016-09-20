    #include <stdio.h>

    double calculate(int n){
    	double fact=1;
    	int i;
    	for(i=1;i<=n;i++)
    	  fact*=i;
    	return fact;
    }

    int main(void) {
        double factorial;
        int n,t,i;
        scanf("%d", &t);
        if(t>=1 && t<=100)
         {
         	for(i=0;i<t;i++)
         	 {
         	 	scanf("%d", &n);
         	 	if(n>=1 && n<=100)
         	 	  factorial=calculate(n);
         	 	printf("%.0lf\n", factorial);
         	 }
         }
    	return 0;
    }
