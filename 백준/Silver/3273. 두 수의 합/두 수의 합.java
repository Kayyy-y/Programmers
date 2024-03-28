import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        int answer;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) numbers[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        answer = Integer.parseInt(st.nextToken());
        
        int pairs = 0;
        int end = 0;
        Arrays.sort(numbers);
        
        for(int i = 0; i < N; i++) {
            if(numbers[i] > answer) {
                end = i;
                break;
            }
        }
        if(end == 0) end = N - 1;
        
        int left = 0, right = end;
        int plus;
        
        while(left != right) {
            plus = numbers[left] + numbers[right];
            if(plus > answer) right--;
            else if(plus < answer) left++;
            else {
                pairs++;
                left++;
            }
        }
        
        
        
        System.out.println(pairs);
        
        
    }
}