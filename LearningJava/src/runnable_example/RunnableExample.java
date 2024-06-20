package runnable_example;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.printf("%d %s\n", i, Thread.currentThread().getName());
            i++;
        }
    }
}
