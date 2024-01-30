class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            switch(token) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                stack.push(-stack.pop() + stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                int num1 = stack.pop();
                stack.push(stack.pop()/num1);
                break;
            default:
                stack.push(Integer.parseInt(token));
                break;
            }
        }
            
        return stack.peek();
    }
}