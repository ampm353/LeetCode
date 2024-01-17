class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int num = 0;

        // 중복된 값을 체크할 Set 생성
        Set<Integer> values = new HashSet<>(map.values());
        return values.size() == map.size();
    }
}