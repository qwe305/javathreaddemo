package priority;

import java.util.concurrent.ThreadFactory;

public class PriorityTest {
    public static void main(String[] args) {
        ThreadFactory factory = new Factory();
        for (int i = 0; i < 100; i++) {
            factory.newThread(()-> {
                for (int j = 0; j < 1; j++) {
                    System.out.println(Thread.currentThread().getName() + ":" +Thread.currentThread().getPriority());
                }

            }).start();
        }
    }

}
class Factory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(((int)(Math.random()*100))%10+1);
        return thread;
    }
}
