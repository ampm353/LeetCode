class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        //Topics 
        // String, Backtracking

        List<String> result = new ArrayList<>();
        
        backtracking(0, 0, s, "", result);

        return result;
    }

    public void backtracking(int index, int count, String s, String ip, List<String> result){

        for(int i = 1 ; i < 4 ; i ++){
            int newCount = count;
            if(index + i  > s.length()){
                break;
            }
            String address = s.substring(index, index + i);
            String newIp = "" + ip;
            if(Integer.parseInt(address) > 255 
            || Integer.parseInt(address) < 0){
                continue;
            }

            if(address.length() > 1){
                if(address.charAt(0) == '0' ){
                    break;
                } 
            }

            if(newIp.length() != 0){
                newIp = newIp + ".";
            }

            newIp = newIp + address;

            newCount ++;
            if(newCount == 4
            && newIp.length() == s.length() + 3){
                result.add(newIp);
                continue;
            }

            backtracking(index + i, newCount, s, newIp, result);
        }
    }
}