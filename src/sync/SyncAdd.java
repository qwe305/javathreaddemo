package sync;

import java.util.ArrayList;
import java.util.List;

public class SyncAdd {
    static Integer j=0;
    static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                for (int k = 0; k < 10000; k++) {
                    synchronized (lock) {
                        j++;
                    }
                }
            }).start();
        }
        Thread.sleep(5000);
        System.out.println(j);
    }
}

