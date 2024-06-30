//Abstrac
abstract class mobile{
    public abstract void calling();
    public abstract void message();
    public abstract void videocall();
}

class mobileV2 extends mobile{
    public void videocall(){
        System.out.println("mobile version 2 can call");
    }
    public void message(){
        System.out.println("mobile can message");
    }
    public void calling(){
        System.out.println("mobile can call");
    }
}
public class exProgram {
    public static void main(String[] args) {
        mobile sc = new mobileV2();
        sc.calling();
        sc.message();
        sc.videocall();
        
    }
}
