public class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("Hello world!");

        }
    }

    public static void main(String[] args) {
        DaemonThread myThread = new DaemonThread();
        myThread.setDaemon(true); // myThread is a Daemon thread ( like garbage collector) now
//        DaemonThread t1 = new DaemonThread();
//        t1.start(); // t1 is a user thread

        myThread.start();
        System.out.println("main done");
    }
}
