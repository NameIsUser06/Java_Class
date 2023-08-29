package part02_os.ch02_shared;

public class ThreadWithR2WaitR1 extends Thread{
    @Override
    public void run() {
        synchronized (Resources.r2) {
            System.out.println(Thread.currentThread().getName() + " take r2 and wait r1");
        }
        synchronized (Resources.r1) {
            System.out.println(Thread.currentThread().getName() + " take r1");
            System.out.println(Thread.currentThread().getName() + " put r1 r2");
        }
    }
}
