class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans=ans^num;
        }
        return ans;
    }
}
// We will always use Xor operator for the single number 
