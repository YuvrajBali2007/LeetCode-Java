class Solution {
    public int maxProduct(int[] nums) {
       int maxprod = nums[0];
       int minprod = nums[0];
       int ans  = nums[0] ;

       for(int i = 1 ; i<nums.length ; i++) {
        int num = nums[i] ;
        int currmax  = Math.max(num , Math.max(num*maxprod , num*minprod)) ;
        int currmin = Math.min(num , Math.min(num*maxprod , num*minprod)) ;
        maxprod = currmax;
        minprod = currmin;
        ans = Math.max(maxprod , ans) ;

       }
       return ans;


    }
}