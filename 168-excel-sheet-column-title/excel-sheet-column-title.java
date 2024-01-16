class Solution {
    public String convertToTitle(int columnNumber) {
        // 26 으로 나누어 값을 찾자.
        // 아스키코드를 이용해서 알파벳을 찾자.
        // A : 65 ~ Z : 90
        // 몫 + 64 를 하면 아스키코드 대문자 

        // 28
        // 26 으로 나누면 
        // 1 몫 나머지 2
        // char(1+64)  +  char(2+64)
        
        // 재귀를 쓰면 어떨까?
        StringBuffer sb = new StringBuffer();

        makeString(sb, columnNumber);

        return sb.reverse().toString();
    }

    public void makeString(StringBuffer sb, int quo){

        if(quo == 0){
            return;
        }
        
        int rem = quo % 26;
        quo = quo / 26;

        // 26
        // Expect : Z
        //
        // 몫:1 나머지: 0  Z
        // 1
        // 몫:0 나머지: 1  A
        // AZ
        // -> 때문에 나머지가 0인(Z) 경우 몫을 하나 빼준다.
        if(rem == 0){
            rem = 26;
            quo -= 1;
        }

        sb.append((char)(rem+64));

        makeString(sb,quo);
    }
}