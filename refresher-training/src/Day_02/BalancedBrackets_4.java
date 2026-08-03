package Day_02;

import java.util.Stack;

public class BalancedBrackets_4 {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return "NO";
                }
                stack.pop();
            }
            else if(ch == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return "NO";
                }
                stack.pop();
            }
            else if(ch == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "{[(])}";
        String str3 = "{{[[(())]]}}";
        System.out.println(isBalanced(str1));
        System.out.println(isBalanced(str2));
        System.out.println(isBalanced(str3));

    }
}


