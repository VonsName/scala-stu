import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ： fjl
 * @date ： 2019/3/14/014 13:31
 */
public class ThreadEx implements Runnable {

    private static int value = 0;
    private Lock lock = new ReentrantLock();

    public void run() {

        while (value < 100) {
            synchronized (ThreadEx.class) {
                System.out.println(Thread.currentThread().getName() + ":" + value++);
                ThreadEx.class.notify();
                try {
                    ThreadEx.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
