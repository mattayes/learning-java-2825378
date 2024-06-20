package threading;

public class Main {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("my first thread");

        ThreadExample thead2 = new ThreadExample();
        thead2.setName("my second thread");

        thread1.start();
        thead2.start();
        System.out.println(Thread.activeCount());
    }
}
