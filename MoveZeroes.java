class Solution {
    public void moveZeroes(int[] nums) {
        int count0=0;
        for(int num:nums){
            if(num==0){
                count0++;
            }
        }
        int index=0;
        for(int num:nums){
            if(num!=0){
                nums[index]=num;
                index++;
            }
        }
        while(count0>0){
            nums[index]=0;
            index++;
            count0--;
        }
    }
}
