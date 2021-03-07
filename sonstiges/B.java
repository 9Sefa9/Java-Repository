public class B extends A{

    public B(){
        super("HI");
    }
    @Override
    public void callMe(String str){

        System.out.println("i implement the method in super class.");
    }
}