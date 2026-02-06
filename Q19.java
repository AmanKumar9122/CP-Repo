import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q19 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split("\\+");
        Arrays.sort(parts);
        String s = "";
        for(int i=0;i<parts.length;i++){
            s += parts[i]+"+";
        }
        System.out.println(s.substring(0,s.length()-1));
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<parts.length;i++){
            int num = Integer.parseInt(parts[i]);
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        // for(int key: hm.keySet()){
        //     System.out.println(key+" "+hm.get(key));
        // }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
