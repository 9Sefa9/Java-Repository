public abstract class A{

    public static void main(String[]args){
            A a = new B();

       
            a.callMe("i am a");
    }

    private String str;
    public A(String str){
        //Constructor
        this.str = str;
    }

    public abstract void callMe(String str);

}