package part02_os.ch02_shared;

public class ThreadWithR1WaitR2 extends Thread{
    @Override
    public void run() {
        synchronized (Resources.r1) {
            System.out.println(Thread.currentThread().getName() + " take r1 and wait r2");
        }
        synchronized (Resources.r2) {
            System.out.println(Thread.currentThread().getName() + " take r2");
            System.out.println(Thread.currentThread().getName() + " put r1 r2");
        }
    }
}
