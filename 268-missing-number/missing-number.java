class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xorsum=0;
        for(int num:nums){
            xorsum^=num;
        }
        
        for(int i=0;i<=n;i++){
            xorsum^=i;
        }
        return xorsum;
    }
}