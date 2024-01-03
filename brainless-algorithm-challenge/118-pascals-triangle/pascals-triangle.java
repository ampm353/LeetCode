class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for(int i = 0 ; i < numRows-1; i++){
            
            List<Integer> next = new ArrayList<>();

            next.add(1);
            
            for(int j = 0 ; j < result.get(i).size() ; j ++){
                if(j == 0) continue;

                next.add(result.get(i).get(j-1) + result.get(i).get(j));
            }

            next.add(1);
            result.add(next);

        }
        return result;
    }
}