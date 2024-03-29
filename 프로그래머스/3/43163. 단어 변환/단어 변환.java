import java.util.*;

class Solution {
    public boolean[] isVisited;
    static int answer = 0;
    
    public boolean isChangeable(String before, String after) {
        int diff = 0;
        for(int i = 0; i < before.length(); i++) {
            if(before.charAt(i) != after.charAt(i)) diff++;
        }
        
        if(diff == 1) return true;
        else return false;
    }
    
    
    public void dfs(String begin, String target, String[] words, int cnt) {
        
        // 종료식
        if(begin.equals(target)) {
            answer = cnt;
            return;  
        }
        
        // 점화식
        for(int i = 0; i < words.length; i++) {
            if(isChangeable(begin, words[i]) && isVisited[i] == false) {
                isVisited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                isVisited[i] = false;
            } else continue;
        }
        
    }
    
    
    public int solution(String begin, String target, String[] words) {
        isVisited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
}