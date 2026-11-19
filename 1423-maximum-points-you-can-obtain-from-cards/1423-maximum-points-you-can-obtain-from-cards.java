
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int maxsum = 0;
        int count = 0;
        for(int i = 0; i<k ; i++) {
            sum+= cardPoints[i] ;

        maxsum = sum;
        }
        for(int i = 0; i<k ; i++) {
            sum -= cardPoints[k-1-i] ;
            sum += cardPoints[n-1-i] ;

            maxsum = Math.max(sum , maxsum) ;
        }
        return maxsum;
       
    }
}