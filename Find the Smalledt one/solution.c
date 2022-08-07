#include <stdio.h>
int main(){
	int arr[100],i,n;
	
    scanf("%d",&n);
	
    for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	
    int s=arr[0];
	
    for(i=1;i<n;i++)
		if(arr[i]<s)
			s=arr[i];
	
    printf("Minimum in this list is : %d",s);
	return 0;
}