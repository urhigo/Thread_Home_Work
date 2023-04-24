import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(1);
        ThreadWork thread1 = new ThreadWork(execute, "thread 1");
        ThreadWork thread2 = new ThreadWork(execute, "thread 2");
        ThreadWork thread3 = new ThreadWork(execute, "thread 3");

        execute.execute(thread1);
        execute.execute(thread2);
        execute.execute(thread3);

        execute.shutdown();
    }
}
