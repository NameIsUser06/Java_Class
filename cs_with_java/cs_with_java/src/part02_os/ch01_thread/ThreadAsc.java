package part02_os.ch01_thread;

public class ThreadAsc extends Thread{
    private int num;

    public ThreadAsc(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
