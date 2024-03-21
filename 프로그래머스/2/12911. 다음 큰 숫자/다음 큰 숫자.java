class Solution {
    private static int checkCnt1(String num){
        int cnt= 0;

        for(int i = num.length() - 1; i > 0; i--){
            if(num.charAt(i) == '1') cnt++;
        }

        return cnt;
    }
    public int solution(int n) {
        
//         if(n == 2) return 4;
        
//         String binary = Integer.toBinaryString(n);
//         int totalCnt1 = 0;
//         int endCnt1 = 0;
//         int check = -1;

//         for(int i = 0; i < binary.length(); i++){
//             if(binary.charAt(i) == '1') totalCnt1++;
//         }

//         for(int i = binary.length() - 1; i > 0; i--){
//             if(binary.charAt(i) == '1'){
//                 endCnt1++;
//                 if(binary.charAt(i-1) == '0') {
//                     check = i;
//                     break;
//                 }
//             }
//         }

//         if(check == -1){
//             String answerStr;
//             answerStr = "1" + "0".repeat(binary.length()-endCnt1) + "1".repeat(endCnt1);
//             int answer = Integer.parseInt(answerStr, 2);
//             return answer;
            
//         }
        

//         String start = binary.substring(0, check - 1);
//         for(int i = 0; i < start.length(); i++){
//             if(start.charAt(i) == '0') break;
//             if(i == start.length()) start = "1" + "0".repeat(check);
//         }

//         String mid = "10";
//         String end = "0".repeat(binary.length() - check - endCnt1) + "1".repeat(endCnt1- 1);

//         int answer = Integer.parseInt(start + mid + end, 2);

//         return answer;
        
        String binary = Integer.toBinaryString(n);
        int Cnt1 = 0;

        Cnt1 = checkCnt1(binary);
        
        String tmp = "";

        for(int i =1; ; i++){
            tmp = Integer.toBinaryString(n + i);
            if(checkCnt1(tmp) == Cnt1) return n + i;
        }
        
        
        
        
        
    }
}