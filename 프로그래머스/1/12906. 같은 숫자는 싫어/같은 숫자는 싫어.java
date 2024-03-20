import java.util.*;

public class Solution {
    // 마지막에 든 값이 뭔지 출력
    private static int getLast(List<Integer> lst){
        int lastidx = lst.size()-1;
        int ans = lst.get(lastidx);
        return ans;
    }
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        //맨 앞 값은 무조건 들어감
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
