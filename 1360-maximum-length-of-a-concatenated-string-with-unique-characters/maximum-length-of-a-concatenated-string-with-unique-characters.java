class Solution {
    public int maxLength(List<String> arr) {
        
        int[] maxLength = {0};

        // 백트레킹을 이용하여 모든 경우를 계산한다.
        // 문자열 s 가 유니크한 문자들의 집합인지 판단할 수 있는게 중요.

        backtracking(arr, 0, "", maxLength);

        return maxLength[0];
    }

    private void backtracking(List<String> arr, int index, String str, int[] maxLength) {
         if (isUnique(str)) {
            // 최대 길이 업데이트
            maxLength[0] = Math.max(maxLength[0], str.length());
        } else {
            // 유일한 문자로만 이루어져 있지 않다면 중단
            return;
        }

        // 배열의 모든 가능한 부분 배열을 찾기 위한 반복문
        for (int i = index; i < arr.size(); i++) {
            // 다음 요소를 현재 부분 배열에 추가하여 재귀 호출
            backtracking(arr, i + 1, str + arr.get(i), maxLength);
        }
    }

    private boolean isUnique(String str) {

        Set<Character> set = new HashSet<>();

        for(char c : str.toCharArray()) {
            if(!set.add(c)) {
                return false;
            }
        }

        return true;
    }
}