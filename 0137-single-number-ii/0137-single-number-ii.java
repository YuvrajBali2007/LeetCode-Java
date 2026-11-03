class Solution {
    public int singleNumber(int[] nums) {
//         int ans = 0;
//        for(int i = 0 ; i<32 ; i++) {
//         int count = 0;
//   for (int j = 0; j < nums.length; j++) {
//         if ((nums[j] & (1 << i)) != 0) {
//             count++;
//         }
//     }
//         if(count % 3 ==1) {
//             ans = ans | (1<<i) ;
//         }
       

//         }
//          return ans ;

        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 1; i = i + 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[n - 1];
    }
}