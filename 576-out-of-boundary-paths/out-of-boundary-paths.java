class Solution {

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        // if(startRow == m || startColumn == n || startRow < 0 || startColumn < 0){
        //     return 1;
        // } 
        // if(maxMove == 0){
        //     return 0;
        // }

        // return findPaths(m, n, maxMove-1, startRow-1, startColumn)
        //     + findPaths(m, n, maxMove-1, startRow, startColumn-1)
        //     + findPaths(m, n, maxMove-1, startRow+1, startColumn)
        //     + findPaths(m, n, maxMove-1, startRow, startColumn+1);

        int[][][] memo = new int[m][n][maxMove+1];
        for( int[][] l : memo){
            for(int[] sl : l){
                Arrays.fill(sl, -1);
            }
        }

        return findPaths(m, n, maxMove, startRow, startColumn, memo);
    }

    public int findPaths(int m, int n, int N, int i, int j, int[][][] memo) {
        if(i == m || j == n || i < 0 || j < 0) return 1;
        if(N == 0) return 0;
        if(memo[i][j][N] >= 0) return memo[i][j][N];

        int mod = 1000000007;

        memo[i][j][N] = 
            (
                (
                    (
                        (
                            (
                                (
                                    findPaths(m, n, N-1, i-1, j, memo) % mod
                                ) + findPaths(m, n, N-1, i, j-1, memo)
                            ) % mod
                        ) + findPaths(m, n, N-1, i+1, j, memo)
                    ) % mod
                ) + findPaths(m, n, N-1, i, j+1, memo)
            ) % mod;
        
        return memo[i][j][N];
    }
}