import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        String line;
        int num;
        
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            line = st.nextToken();
            if("push".equals(line)) {
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if("pop".equals(line)) {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.pop());
            } else if("size".equals(line)) {
                System.out.println(stack.size());
            } else if("empty".equals(line)) {
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else {
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());
            } 
            
        }        
    }
}