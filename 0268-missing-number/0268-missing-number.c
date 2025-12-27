int missingNumber(int* nums, int numsSize) {
    int i=0,c=0;
    for(i=1;i<=numsSize;i++){
        c+=i;
    }
    for(i=0;i<numsSize;i++){
        c-=nums[i];
    }
    return c;
}