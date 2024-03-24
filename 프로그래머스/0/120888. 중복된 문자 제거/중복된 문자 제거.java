import java.util.*;


class Solution {
    public String solution(String my_string) {
        Set<Character> check = new HashSet<>();
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(!check.contains(my_string.charAt(i))) {
                answer += my_string.charAt(i);
            }
            check.add(my_string.charAt(i));
        }
        
        return answer;
    }
}