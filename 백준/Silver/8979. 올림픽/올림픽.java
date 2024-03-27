import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] medal = new int[5][N];
        
        StringTokenizer st2;
        int tmp = 0;
        int target = 0;
        
        
        for(int i = 0; i < N; i++){
            st2 =  new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++){
                medal[j][i] = Integer.parseInt(st2.nextToken());
                if(j != 0) tmp += medal[j][i] * Math.pow(100, 3 - j);
            }
            if(medal[0][i] == K) target = tmp;
            medal[4][i] = tmp;
            tmp = 0;
        }
        
        int[] totalScore = new int[N];
        
        for(int i = 0; i < N; i++) {
            totalScore[i] = medal[4][i];
        }
        
        Arrays.sort(totalScore);
        
        for(int i = N - 1; i >= 0; i--){
            if(totalScore[i] == target) {
                System.out.println(N - i);
                break;
            }
        }
        
    }
}