package singleton;

public class Singleton {
    private static Singleton singleton = new Singleton(); //we created a single object

    private Singleton() {

    }
    public static Singleton getInstance() {
        return singleton;
    }
    public void doWork() {
        System.out.println("Do my Work");

    }
}
