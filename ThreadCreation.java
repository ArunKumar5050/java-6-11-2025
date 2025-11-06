class MyTask implements Runnable {
    public void run() {
        System.out.println("Task is running in a separate thread.");
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
    }
}

//New > Runnable > running > Blocked/waiting > Terminated(thread Lifecycle)