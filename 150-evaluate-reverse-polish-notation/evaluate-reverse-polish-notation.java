class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.length() == 1 
            &&( (token.charAt(0) == '+') ||
                (token.charAt(0) == '-') ||
                (token.charAt(0) == '*') ||
                (token.charAt(0) == '/') )){
                
                int num1 = stack.pop();
                int num2 = stack.pop();

                if(token.charAt(0) == '+'){
                    stack.push(num2 + num1);
                }else if(token.charAt(0) == '-'){
                    stack.push(num2 - num1);
                }else if(token.charAt(0) == '*'){
                    stack.push(num2 * num1);
                }else{
                    stack.push(num2 / num1);
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}