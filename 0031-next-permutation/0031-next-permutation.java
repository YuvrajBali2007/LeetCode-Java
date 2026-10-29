class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
       int i = n-2;
       int pivot =-1 ;

       while(i>=0) {
        if (nums[i] < nums[i+1]) {
            pivot = i;
            break;
        }
         i--;
         }
         if (pivot != -1) {
            
            int j = nums.length-1;
            while(nums[j] <= nums[pivot]) {
                j--;
            }

         int temp = nums[j] ;
         nums[j] = nums[pivot];
         nums[pivot] = temp;
    }
    int left  = pivot+1;
    int right = nums.length-1;
    while(left < right) {
        int temp = nums[left] ;
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
    }
}