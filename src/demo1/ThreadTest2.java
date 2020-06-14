package demo1;
/**
 * @author 12467
 * 创建线程2：实现runnable接口，传入Thread
 */
public class ThreadTest2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadTest2()).start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习"+i);
        }
    }
}
