class Solution {
    private static int check(int a, int b, int c){
        if(a + b + c == 0) return 1;
        else return 0;        
    }
    
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number.length; j++){
                for(int k = 0; k < number.length; k++){
                    if(i != j && j != k && i != k){
                        answer += check(number[i], number[j], number[k]);
                    }
                }
            }
        }
        
        return answer/6;
    }
}