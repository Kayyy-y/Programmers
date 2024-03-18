class Solution {
    public String solution(int n) {
        String answer = "";
        
        answer += "수박".repeat(n/2);
        
        //어떤 글자로 끝나는지 확인
        if(n % 2 == 1){
            answer += "수";
        }
        
        return answer;
    }
}
