package First_Ques;

/*
Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
 */
class MyThread implements Runnable{
    public void run() {
        for (int i=1;i<10;i++){
            System.out.println(i);
            //this sleep () call by thread on each iteration

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }
}
public class First_Question {
    public static void main(String[] args){
        System.out.println("Main Thread Start");
        Second_Question.MyThread t = new Second_Question.MyThread();
        Thread t1 =new Thread(t);

        System.out.println("Child Thread Started");
        t1.start();

        //main method called join so , it wait until t1 thread complete its execution
        try{
           t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }


        //this line cannot be executed without executing that t1 thread execution get completed
        System.out.println("Main Thread Execution Completed");

    }

}
