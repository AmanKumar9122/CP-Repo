import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q30 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=1;i<=n;i++){
                pq.add(i);
            }
            List<int[]> ops = new ArrayList<>();
            while(pq.size()>1){
                int a = pq.poll();
                int b = pq.poll();
                int c = (a+b+1)/2; // ceil((a+b)/2)
                ops.add(new int[]{a,b});
                pq.add(c);
            }

            sb.append(pq.peek()).append('\n');
            for(int[] op:ops){
                sb.append(op[0]).append(" ").append(op[1]).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}

// Explanation:
// This code reads multiple test cases. For each test case, it initializes a priority queue
// with integers from 1 to n. It repeatedly takes the two largest numbers, computes their
// ceiling average, and adds it back to the queue, while recording the operations. Finally,
// it outputs the last remaining number and the sequence of operations performed.