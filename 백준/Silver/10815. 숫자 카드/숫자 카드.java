import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> have = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) have.put(st.nextToken(), 0);
        
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            if(have.get(st.nextToken()) != null) System.out.print("1 ");
            else System.out.print("0 ");
        }
        
    }
}