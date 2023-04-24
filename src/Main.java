import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(3);
        execute.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println(i + " " + execute.getClass().getName());
                }
            }
        });
        execute.shutdown();
    }
}
