class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        //Topics 
        // String, Backtracking

        List<String> result = new ArrayList<>();

        /**
        * backtracking parameter 
        * - index : 커서 위치
        * - count : dot 의 갯수
        * - s : 원본 string
        * - ip : 현재까지 작성된 ip
        * - result : 유효한 ip 목록
        */
        backtracking(0, 0, s, new StringBuffer(), result);

        return result;
    }

    public void backtracking(int index, int count, String s, StringBuffer ip, List<String> result){

        for(int i = 1 ; i < 4 ; i ++){
            
            if(index + i  > s.length()){
                break;
            }

            String address = s.substring(index, index + i);

            if(Integer.parseInt(address) > 255 
            || Integer.parseInt(address) < 0){
                continue;
            }

            if(address.length() > 1){
                if(address.charAt(0) == '0' ){
                    break;
                } 
            }

            // backtracking 결과 뒤로 갈 경우, 
            // 변수가 이전 값을 가지고 있지 않기 위해 매번 지역변수 생성
            int newCount = count;
            StringBuffer newIp = new StringBuffer(ip);
            

            if(newIp.length() != 0){
                newIp.append(".");
                newCount ++;
            }
            newIp.append(address);
            
            if(newCount == 3
            && newIp.length() == s.length() + 3){
                result.add(newIp.toString());
                continue;
            }

            backtracking(index + i, newCount, s, newIp, result);
        }
    }
}