/*

Write a program to show application of Singleton Design Pattern.
 */

class Logger {
    // creating static instance (single object)
    private static Logger instance;

    // private constructor
    private Logger() {
        System.out.println("Logger initialized");
    }

    // public method to provide access
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class Fifth_Question {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First message");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message");

        // Checking both references
        System.out.println(logger1 == logger2);
    }
}
