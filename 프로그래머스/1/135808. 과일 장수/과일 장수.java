import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);

        // 뒤에서부터 잘라야 한 박스 안에 들어가는 사과값이 최대가 됨!
        // 박스를 채우지 못하면 어차피 0원
        for(int i = score.length - m; i >= 0 ; i -= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}
