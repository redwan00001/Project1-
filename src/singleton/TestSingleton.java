package singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.doWork();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.doWork();









    }
}
