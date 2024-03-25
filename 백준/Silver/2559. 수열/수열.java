import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] temp = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st2.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        
        for(int i = 0; i < N - K + 1; i++){
            tmp = 0;
            for(int j = 0; j < K; j++) {
                tmp += temp[i + j];
            }
            if(tmp > max) max = tmp;
        }
        
        System.out.println(max);
    }
    
    
}