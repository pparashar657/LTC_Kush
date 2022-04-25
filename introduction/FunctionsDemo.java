package introduction;

public class FunctionsDemo {

    public static void main(String[] args) {
        System.out.println("I am inside main");
        func1();
        System.out.println("I am exiting main");
    }

    static void func1() {
        System.out.println("I am inside func1");
        func2();
        System.out.println("I am exiting func1");
    }

    static void func2() {
        System.out.println("I am inside func2");
        func3();
        System.out.println("I am exiting func2");
    }

    static void func3() {
        System.out.println("I am inside func3");
        System.out.println("Ok Bro");
        System.out.println("I am exiting func3");
    }

}
