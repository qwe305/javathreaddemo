package demo1;

import java.util.concurrent.*;

/**
 * @author 12467
 * 创建线程3：实现Callable接口
 */
public class ThreadTest4 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"我在看代码"+i);
        }
        return "over";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTest4 t1 = new ThreadTest4();
        ThreadTest4 t2 = new ThreadTest4();
        ThreadTest4 t3 = new ThreadTest4();
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> r1=service.submit(t1);
        Future<String> r2=service.submit(t2);
        Future<String> r3=service.submit(t3);
        System.out.println(r1.get());
        System.out.println(r2.get());
        System.out.println(r3.get());
        service.shutdown();
    }
}
