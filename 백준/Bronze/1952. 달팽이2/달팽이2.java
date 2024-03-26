import java.util.*;
import java.io.*;


public class Main {
    public static int[] dx = {0, 1, 0 ,-1};
    public static int[] dy = {-1, 0, 1 ,0};
    
    
    private static int bfs(int M, int N) {
        int answer = 0;
        int cnt = 1;
        int direction = 1;
        int x = 0, y = 0;
        boolean[][] isVisited = new boolean[N][M];


        
        while(cnt < (M * N)) {
            
            isVisited[x][y] = true;
            
            // 방향이 전환되야 하는지 확인
            int nextx = x + dx[direction];
            int nexty = y + dy[direction];
            
            if(nextx < 0 || nexty < 0 || nextx > N - 1 || nexty > M - 1 || isVisited[nextx][nexty]){
                direction = (direction + 1) % 4;
                answer++;
            }
            
            //전진!
            x += dx[direction];
            y += dy[direction];
            cnt++;
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        System.out.println(bfs(M, N));
    }
}
