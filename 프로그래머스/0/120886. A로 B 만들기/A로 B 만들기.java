import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeC = before.split("");
        String[] afterC = after.split("");
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);
        
        for(int i = 0; i < beforeC.length; i++) {
            if(!beforeC[i].equals(afterC[i]))
                return 0;   
        }
        
        return 1;
    }
}