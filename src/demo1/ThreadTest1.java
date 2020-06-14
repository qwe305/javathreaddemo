package demo1;
/**
 * @author 12467
 * 创建线程1：继承Thread 重写run方法
 */
public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        test1.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习"+i);
        }
    }
}
