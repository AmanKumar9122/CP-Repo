import java.io.*;
import java.util.*;

/*
 * Interface for storing notifications
 */
interface INotificationStore {
    void storeNotifications(Queue<String> notifications);
}

/*
 * Your NotificationManager class
 */
class NotificationManager {

    private INotificationStore store;
    private int K;
    private Queue<String> buffer;
    private Map<String,Integer> freq;

    public NotificationManager(INotificationStore store, int K) {
        this.store = store;
        this.K = K;
        buffer = new LinkedList<>();
        freq = new HashMap<>();
    }

    public void registerNotification(String notificationType) {
        // WRITE YOUR LOGIC HERE
        buffer.offer(notificationType);
        freq.put(notificationType, freq.getOrDefault(notificationType,0)+1);
        if (buffer.size()==K) {
            store.storeNotifications(buffer);
        }
    }

    public int getPendingNotifications() {
        // WRITE YOUR LOGIC HERE
        return buffer.size();
    }

    public String getMostFrequentNotification() {
        // WRITE YOUR LOGIC HERE
        String result = "";
        int maxFreq = 0;
        
        for(String type : freq.keySet()){
            int count = freq.get(type);
            if(count>maxFreq || (count==maxFreq && type.compareTo(result)<0)){
                maxFreq = count;
                result = type;
            }
        }
        return result;
    }
}

/*
 * Dummy store implementation for testing
 */
class NotificationStore implements INotificationStore {

    @Override
    public void storeNotifications(Queue<String> notifications) {

        // Simulate storing
        while (!notifications.isEmpty()) {
            notifications.poll();
        }
    }
}

public class Q6 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine().trim());
        int Q = Integer.parseInt(br.readLine().trim());

        INotificationStore store = new NotificationStore();
        NotificationManager manager = new NotificationManager(store, K);

        while (Q-- > 0) {

            String[] command = br.readLine().split(" ");

            switch (command[0]) {

                case "register":
                    manager.registerNotification(command[1]);
                    break;

                case "getPending":
                    System.out.println(manager.getPendingNotifications());
                    break;

                case "getMostFrequent":
                    System.out.println(manager.getMostFrequentNotification());
                    break;
            }
        }
    }
}
