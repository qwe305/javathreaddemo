package lamdaTest;

public class Test1 {
    public static void main(String[] args) {
        Like like = name -> "I like "+name;
        System.out.println(like.like("125"));
    }
}

interface Like {
    String like(String name);
}
