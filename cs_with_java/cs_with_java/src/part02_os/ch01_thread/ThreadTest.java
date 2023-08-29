package part02_os.ch01_thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadAsc asc = new ThreadAsc(100);
        ThreadDesc desc = new ThreadDesc(100);
        Thread t = new Thread(desc);

        asc.start();
        t.start();
    }
}
