class Solution {
    // 1 개수를 체크
    private static int checkCnt1(String num){
        int cnt= 0;

        for(int i = num.length() - 1; i > 0; i--){
            if(num.charAt(i) == '1') cnt++;
        }

        return cnt;
    }
    public int solution(int n) {
//////// 정확성은 맞는데 효율성에서 탈락한 코드 ////////
        // 두개면 별다른 조건 없이 4 출력
//         if(n == 2) return 4;

        // 1) 전체에서 __01__의 형태가 나오는 지점 찾기
        // 2) __01__을 기준으로 두 파트로 나눔(start, end)
            // a) 01파트가 없는 경우(check == -1) : end 파트의 1 개수를 참고해 총 길이가 +1이 되도록 구성
        // 3) 01을 10으로 변경, start는 그대로/end는 1의 개수를 그대로 유지하되 가장 작은 값을 입력
        
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


        // 간단한 풀이!
        // 생각보다 다음 큰 숫자 사이의 갭이 크지 않을 것이다
        // 그렇다면 1씩 올리면서 그냥 2진수 변환시 1의 개수를 확인하면 되는거 아닐까?
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
