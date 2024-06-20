package runnable_example;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample());
        t1.setName("t1");
        Thread t2 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.printf("%d %s\n", i, Thread.currentThread().getName());
                i++;
            }
        });
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
