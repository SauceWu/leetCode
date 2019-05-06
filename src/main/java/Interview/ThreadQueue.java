package Interview;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sauce
 * @since 2019-04-15
 */
public class ThreadQueue {
    /**
     * 编写一个程序，开启 3 个线程 A,B,C，这三个线程的输出分别为 A、B、C，每个线程将自己的 输出在屏幕上打印 10 遍，要求输出的结果必须按顺序显示。如：ABCABCABC....
     *
     *
     */

    private final int count;
    //保证原子性 volatile int 也可以
    private AtomicInteger index = new AtomicInteger(0);
    //可重入锁
    private Lock lock = new ReentrantLock();
    private Thread[] threads;
    private int period;

    public static void main(String[] src) {
        int count = new Random().nextInt(26);
        new ThreadQueue(3, count * 3);
    }
    //
    public ThreadQueue(int count, int period) {
        this.count = count;
        this.period = period;
        threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            int finalI = i;
            threads[i] = work(i, () -> System.out.println((char) (finalI + 65)));
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

    private Thread work(int i, Runnable function) {
        return new Thread(() -> {
            while (true) {
                lock.lock();
                if (index.get() >= period) {
                    break;
                }
                if (index.get() % count == i) {
                    function.run();
                    index.incrementAndGet();
                }
                lock.unlock();

            }
        });
    }

}
