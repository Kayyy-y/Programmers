import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s1 = br.readLine();
        String s2 = br.readLine();

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        int answer = 0;
        
        for(char c : s1Arr){
            q1.add(c);
        }
        for(char c : s2Arr){
            q2.add(c);
        }
        
        while(!q1.isEmpty() && !q2.isEmpty()) {
            char lastQ1 = q1.peek();
            char lastQ2 = q2.peek();
            if(lastQ1 == lastQ2) {
                answer++;
                q1.poll(); q2.poll();
            } else {
                if(Character.compare(lastQ1, lastQ2) < 0) q1.poll();
                else q2.poll();
            }
        }
        
        System.out.println(s1.length() + s2.length() - (answer * 2));                
    }
}