import java.util.*;

public class Solution {
    private static int getLast(List<Integer> lst){
        int lastidx = lst.size()-1;
        int ans = lst.get(lastidx);
        return ans;
    }
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        answer.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == getLast(answer)) continue;
            else answer.add(arr[i]);
        }    
        int[] answer_arr = new int[answer.size()];
            
        for(int i = 0; i < answer_arr.length; i++){
            answer_arr[i] = answer.get(i);
        }
        

        return answer_arr;
    }
}