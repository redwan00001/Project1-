package nestedclass;

public class OuterClass {

    //Outer class variables
    private int outerNum1 = 10;
    //Outer class constructor
    public OuterClass() {

    }
    Inner inner = new Inner();

    //Outer class methods
    public void outerMethod1() {
        System.out.println("outer class method A");
        inner.innerMethod1();
    }

    public void outerMethod2() {
        System.out.println("outer class method B");

    }
    //inner class A
    public class Inner{
        //inner class constructor
        public Inner() {

        }
        //inner class variables
        int numA  = 6;
        //inner class methods
        public void innerMethod1() {
            outerNum1 = 64;
            System.out.println("This is Inner A method");
        }

        }
    }//inner class B ends

