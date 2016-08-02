#include <stdio.h>
#include <string.h>
#define NUMBER 1
main ()
{
/*This program calculates the number of 2's present in the number x*/

int arr[]={221};
int i=0,count=0;

for(i=0;i<NUMBER;i++)
{
while(arr[i]>0)
{
int rem,quo; 
rem=arr[i]%10;
quo=arr[i]/10;
printf("rem= %d and quo=%d \n ", rem,quo);
if(rem==2&&quo==2)
{
count=count+2;

printf("Number is : %d\n",arr[i]);
arr[i]=arr[i]/10;

}
else if(rem==2)
{
count++;
printf("Number is : %d\n",arr[i]);
} 
else if(quo==2)
{
count++;
printf("Number is : %d\n",arr[i]);
arr[i]=arr[i]/10;
}
arr[i]=arr[i]/10;
}
}
printf("THe number of 2's are : %d\n",count);
printf("\n\n\n");
}
