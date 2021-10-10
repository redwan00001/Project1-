package exceptions;

public class Math {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("Line 1");
        try {
            System.out.println("Line2:" + a / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Your code has issue");
        }

    }
}
