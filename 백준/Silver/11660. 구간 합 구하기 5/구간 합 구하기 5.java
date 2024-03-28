import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] numbers = new int[N][N];
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] point = new int[M][4];
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++) {
                point[i][j] = Integer.parseInt(st.nextToken()) - 1;
            }
        }
    
        int[][] dp = new int[N][N];
        
        // 부분 합 계산
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                dp[i][j] = numbers[i][j];
                if(i > 0) dp[i][j] += dp[i - 1][j];
                if(j > 0) dp[i][j] += dp[i][j - 1];
                if(i > 0 && j > 0) dp[i][j] -= dp[i - 1][j - 1];
            }
        }

        // 각 쿼리에 대한 답 계산 및 출력
        for(int i = 0; i < M; i++) {
            int y1 = point[i][0];
            int x1 = point[i][1];
            int y2 = point[i][2];
            int x2 = point[i][3];
            
            int answer = dp[y2][x2];
            if(y1 > 0) answer -= dp[y1 - 1][x2];
            if(x1 > 0) answer -= dp[y2][x1 - 1];
            if(y1 > 0 && x1 > 0) answer += dp[y1 - 1][x1 - 1];

            System.out.println(answer);
        }
    }
}
