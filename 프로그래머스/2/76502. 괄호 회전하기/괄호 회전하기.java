import java.util.*;
    
class Solution {
    private static boolean bracketCheck(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}')) {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
        
    }

    
    public int solution(String s) {
        int n = s.length();
        int answer = 0;
        
        if(n % 2 == 1) return 0;

        // 문자열을 회전시키면서 올바른 괄호 문자열이 되는 경우의 수를 찾음
        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (bracketCheck(rotated)) {
                   answer++;
            }
        }

        return answer;
    }

}