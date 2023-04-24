import java.util.concurrent.ExecutorService;

public class ThreadWork implements Runnable{
    ExecutorService execute;
    String name;

    ThreadWork (ExecutorService executorService, String name){
        this.execute = executorService;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i + " " + name);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
