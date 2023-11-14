#include<stdio.h>
int *TwoSums(int *nums,int Numsize,int target){
    int sum = 0 ;
    int i,j;
    static int result[2]={0,0};
    for(i=0;i<Numsize-2;i++){
        for(j=i+1;j<=Numsize-1;j++){
            sum = nums[i]+nums[j];
            if(target == sum){
                result[0] = i;
                result[1] = j;
            }
        }
    }
    return result;
}
void main(){

    int nums[] = {2,7,11,15,8};
    int target =15;
    int length = sizeof(nums)/sizeof(nums[0]);
    int *arr;
    arr =TwoSums(nums,length,target);
    printf("[%d,%d]",arr[0],arr[1]);
    
}

