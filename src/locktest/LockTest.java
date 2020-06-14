package locktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static Integer j=0;
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                for (int k = 0; k < 10000; k++) {
                    try{
                        lock.lock();
                        j++;
                    }finally {
                        lock.unlock();
                    }

                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(j);
    }
}
