public class MyOptionTester {
    public static void main(String args[]) {
        MyMap<String> none, some;
        none = new MyOptionNone<String>();
        some = new MyOptionSome<String>("Value");
        System.out.println(none);
        System.out.println(some);
        System.out.println("the("+some+") = "+some.the());
        System.out.println("the("+none+") = "+none.the());
    }
}