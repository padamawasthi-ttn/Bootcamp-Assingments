import javax.security.auth.callback.Callback;
import java.util.concurrent.*;

/*
WAP to show usage of Callable and demonstrate how it is different from Runnable
 */
//------main class
public class Fifth_Ques {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //using runnable
        executor.execute(new RunnableTask());

        //using callable
        Future<Integer> result = executor.submit (new CallableTask());

        //getting result fromm callable
        Integer value = result.get();
        System.out.println("result From Callable= "+value);

        executor.shutdown();
    }
}


//runnable example
class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println("inside runnable call method");

    }
}
//callable example
class CallableTask implements Callable<Integer>{
    public Integer call() throws Exception{
        System.out.println("inside calllable method ");
        return 10;
    }
}

