import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        while(n-- > 0){
            String s = br.readLine();
            switch (s) {
                case "Tetrahedron": sum+=4; break;
                case "Cube": sum+=6; break;
                case "Octahedron": sum+=8; break;
                case "Dodecahedron": sum+=12; break;
                case "Icosahedron": sum+=20; break;
                
            }
        }
        System.out.println(sum);
    }
}
