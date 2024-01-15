class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n <= 2) return n;

        int max = 2;

        for(int[] a : points){

            Map<Double, Integer> map = new HashMap<>();

            for(int[] b : points){

                if( a == b ) continue;

                double slope = 0;

                
                if(b[0] - a[0] == 0) slope = Double.POSITIVE_INFINITY; // 수직선 인 경우 무한대로 표기
                else slope = (b[1] - a[1]) / (double)(b[0] - a[0]) ;

                map.put(slope, map.getOrDefault(slope, 1) + 1);

                max = Math.max(max, map.get(slope));
            }
        }

        return max;
    }
}