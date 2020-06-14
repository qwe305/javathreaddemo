package demo1;

/**
 * @author 12467
 * 并发问题演示
 */
public class ThreadTest3 implements Runnable{
    private int i=10000;
    @Override
    public void run() {
        while (true){
//            synchronized (this) {
                if(i<=0) break;
                System.out.println(Thread.currentThread().getName() + "拿到了第" + i-- + "张票");
//            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest3 t=new ThreadTest3();
        new Thread(t,"xiaoming").start();
        new Thread(t,"xiaohong").start();
        new Thread(t,"xiaoli").start();
    }
}
