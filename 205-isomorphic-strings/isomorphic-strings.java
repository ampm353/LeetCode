class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 길이만큼 for 돌리며 char 를 비교한다.
        // 아스키코드를 활용하여 index 의 문자가 동일한지 체크한다.

        int[] sAscCode = new int[256];
        int[] tAscCode = new int[256];

        for( int i = 0; i < s.length(); i++){

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // s 검증
            if(sAscCode[charS] == 0){
                sAscCode[charS] = charT;
            }else if(sAscCode[charS] != charT){
                return false;
            }

            // t 검증
            if(tAscCode[charT] == 0){
                tAscCode[charT] = charS;
            }else if(tAscCode[charT] != charS){
                return false;
            }
        }

        return true;
    }
}