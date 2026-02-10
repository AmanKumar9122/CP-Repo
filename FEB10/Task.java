import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

enum Priority {
    LOW, MEDIUM, HIGH
    }

enum Status {
    PENDING, IN_PROGRESS, COMPLETED
    }  
public class Task {
    private int id;
    private String description;
    private Priority priority;
    private Status status;
    private LocalDateTime createdTime;

    public Task(int id,String description,Priority priority){
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = status.PENDING;
        this.createdTime = LocalDateTime.now();
    }
    public int getId() { return id; }
    public Priority getPriority() { return priority; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "[ID=" + id +
                ", Desc=" + description +
                ", Priority=" + priority +
                ", Status=" + status +
                ", Created=" + createdTime + "]";
    }
}
public class TodoApp{
    private Queue<Task> pendingQueue = new LinkedList<>();
    public void addTask(Task task){
        pendingQueue.offer(task);
        System.out.println("Task Added");
    }
    public void viewTasks() {
        if (pendingQueue.isEmpty()) {
            System.out.println("No pending tasks.");
            return;
        }
        System.out.println("Pending Tasks:");
        for (Task t : pendingQueue) {
            System.out.println(t);
        }
    }

    // Process Task(FIFO)
    public void processTask() {
        Task task = pendingQueue.poll();
        if (task == null) {
            System.out.println("No tasks to process.");
            return;
        }
        task.setStatus(Status.COMPLETED);
        System.out.println("Task Completed:");
        System.out.println(task);
    }

    //Driver
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TodoApp app = new TodoApp();

        while (true) {

            System.out.println("\n========= TODO MENU =========");
            System.out.println("1. Add Task");
            System.out.println("2. View Pending Tasks");
            System.out.println("3. Process Task");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();

                    System.out.print("Enter Priority (LOW/MEDIUM/HIGH): ");
                    Priority priority =
                            Priority.valueOf(sc.nextLine().toUpperCase());

                    Task task = new Task(id, desc, priority);
                    app.addTask(task);
                    break;

                case 2:
                    app.viewTasks();
                    break;

                case 3:
                    app.processTask();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}
