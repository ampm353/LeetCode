class Solution {
    public int numSquares(int n) {
        // sqrt *sqrt = n  -> 1
        // sqrt * sqrt + 1 = n -> 2

        int sqrt = (int)Math.sqrt(n);

        if(sqrt * sqrt == n) return 1;


        while(n % 4 == 0) n = n / 4;
        
        if( n % 8 == 7) return 4;


        for(int i = 1; i * i <= n; i++){
            int square = i * i;

            int otherSqrt = (int)Math.sqrt(n-square);

            if(otherSqrt * otherSqrt == n-square) return 2;
        }

        return 3;
    }
}