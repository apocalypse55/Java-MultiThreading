public class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);

    }

    @Override
    public void run() {
        System.out.println("Thread is running... ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(Thread.currentThread().getName() + "- Priority: " + Thread.currentThread().getPriority() + " - count " + i);
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PriorityThread l = new PriorityThread(" Low Priority Thread");
        PriorityThread m= new PriorityThread(" Medium Priority Thread");
        PriorityThread h = new PriorityThread(" High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
