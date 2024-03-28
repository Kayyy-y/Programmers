import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int[] between = new int[N - 1];
        int[] station = new int[N];
        boolean[] buy = new boolean[N];
        int minPrice = Integer.MAX_VALUE;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) between[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            station[i] = Integer.parseInt(st.nextToken());
            if(station[i] < minPrice) {
                minPrice = station[i];
                buy[i] = true;
            }
        }
        
        int answer = 0;
        int road = 0;
        
        for(int i = N - 2; i >= 0; i--) {
            road += between[i];
            if(buy[i] == true) {
                answer += station[i] * road;
                road = 0;
            }
        }
        
        System.out.println(answer);
        
        
    }
}