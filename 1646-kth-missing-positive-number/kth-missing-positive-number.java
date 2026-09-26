class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            int correctnum = mid+1;
            int missing = arr[mid ]- correctnum;
            if(missing>=k)hi = mid-1;
            else lo = mid+1;

        }
        return hi+1+k;
    }
}