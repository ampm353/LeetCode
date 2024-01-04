class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder sb = new StringBuilder();

        int word1Len = word1.length();
        int word2Len = word2.length();

        int maxLen = word1Len > word2Len ? word1Len : word2Len;

        for(int i = 0; i< maxLen; i++){

            if(word1Len > i){
                sb.append(word1.charAt(i));
            }
            if(word2Len > i){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}