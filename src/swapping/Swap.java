package swapping;

public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp;

        temp = a;
        a = b;
        b = temp;


        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
