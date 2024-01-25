class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // DP 를 통해 풀자.
        // 표를 상상
        //      a   b   c   d   e
        //  a   1   1   1   1   1
        //  c   1   1   2   2   2
        //  e   1   1   2   2   3

        //      a   b   c   d   e   f
        //  a   1   1   1   1   1   1
        //  b   1   2   2   2   2   2
        //  c   1   2   3   3   3   3

        int length1 = text1.length();
        int length2 = text2.length();
        
        int[][] dp = new int[length1][length2];

        for(int i = 0 ; i < length1; i++){

            for(int j = 0 ; j < length2; j++){

                if(text1.charAt(i) == text2.charAt(j)){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                }else{
                    if(i == 0 && j == 0){
                        dp[i][j] = 0;
                    }else if(i == 0){
                        dp[i][j] = dp[i][j-1];
                    }else if(j == 0){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                    }
                }
            }
            
        }

        return dp[length1-1][length2-1];
    }
}