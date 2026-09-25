class Solution {
    public int missingNumber(int[] nums) {
     int n = nums.length;
     int realsum = n*(n+1)/2;
     int totalsum=0;
     for(int num:nums){
        totalsum+=num;
     }
    return realsum-totalsum;

    }
}