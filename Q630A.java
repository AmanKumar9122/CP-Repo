import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q630A{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // long n = sc.nextLong(); 
        // System.out.println("25");
        // Object[] obj = {1,"A","A"}; 
        // for(var v:obj){
        //     System.out.println(v);
        // }
        // // --------------------------
        // System.out.println("--");
        // for (Object object : obj) {
        //     System.out.println(object);
        // }

        // TreeSet<Integer> set = new TreeSet<>();
        // set.add(10);
        // set.add(20);
        // set.add(null); //Exception
        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(10);
        // al.add(20);
        // al.add(30);
        // // for (Integer integer : al) {
        // //     if(integer.equals("10")){
        // //         al.remove(integer);
        // //     }
        // //     System.out.println(integer);
        // // }
 
        // List<Integer> list = new CopyOnWriteArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // for (Integer integer : list) {
        //     if(integer.equals(10)){
        //         list.remove(integer);
        //     }
        //     System.out.println(integer);
        // }

        // fail fast // fail safe -- exception 
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        for (Integer integer : al) {
            if(integer.equals(1)){
                al.set(1, 5);
            }
            System.out.println(integer);
        }
   }
}
