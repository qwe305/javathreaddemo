package lamdaTest;

public class Test2 {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        },"thread-1").start();
    }
}