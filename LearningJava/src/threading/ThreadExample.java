package threading;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.printf("%d %s\n", i, getName());
            i++;
        }
    }
}
