/*
WAP to showcase the usage of volatile in Java
*/
class Third_Ques{

    static volatile boolean volatileVariable = false;

    public static void main(String[] args) {

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            volatileVariable = true;
            System.out.println("Writer thread updated flag to true");
        });

        Thread reader = new Thread(() -> {
            while (!volatileVariable) {
                // busy waiting
            }
            System.out.println("Reader thread detected flag change");
        });

        writer.start();
        reader.start();
    }
}
