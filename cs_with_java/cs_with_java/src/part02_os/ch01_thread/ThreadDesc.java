package part02_os.ch01_thread;

public class ThreadDesc implements Runnable {
    private int num;

    public ThreadDesc(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
