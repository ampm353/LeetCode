class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> result = new ArrayList<>();

        result.add(1);

        for(int i = 1 ; i <= rowIndex; i ++){
            List<Integer> list = new ArrayList<>();

            list.add(1);

            for(int j = 1 ; j < result.size() ; j ++){
                list.add(result.get(j-1) + result.get(j));
            }

            list.add(1);

            result = list;
        }

        return result;
    }
}