import java.util.*;

public class Q50 {
    static class Instrument {
        int days;
        int index;

        Instrument(int days, int index) {
            this.days = days;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Instrument[] instruments = new Instrument[n];

        for (int i = 0; i < n; i++) {
            int days = sc.nextInt();
            instruments[i] = new Instrument(days, i + 1);
        }

        Arrays.sort(instruments, Comparator.comparingInt(a -> a.days));

        List<Integer> learned = new ArrayList<>();
        int remainingDays = k;

        for (Instrument inst : instruments) {
            if (remainingDays >= inst.days) {
                remainingDays -= inst.days;
                learned.add(inst.index);
            } else {
                break;
            }
        }

        System.out.println(learned.size());
        for (int idx : learned) {
            System.out.print(idx + " ");
        }
    }
}
