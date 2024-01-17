import java.util.*; 

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int num = 0;

        // 중복된 값을 체크할 Set 생성
        Set<Integer> uniqueValues = new HashSet<>();

        // Map의 모든 값들을 얻어옴
        Collection<Integer> values = map.values();

        for (Integer value : values) {
            // 중복된 값이 이미 Set에 있다면 중복이 있다고 판단
            if (!uniqueValues.add(value)) {
                System.out.println("중복된 값이 존재합니다: " + value);
                // 원하는 추가적인 처리 수행
                return false;
            }
        }
        return true;
    }
}