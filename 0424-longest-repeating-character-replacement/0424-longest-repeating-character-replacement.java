class Solution {
    public int characterReplacement(String s, int k) {

        int maxlen = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            int j = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != ch) {
                    count++;
                }

                while (count > k) {

                    if (s.charAt(j) != ch) {
                        count--;
                    }

                    j++;
                }

                maxlen = Math.max(maxlen, i - j + 1);
            }
        }

        return maxlen;
    }
}