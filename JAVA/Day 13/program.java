
class shape{
public void myType(){
    System.out.println("im parent");
}
}

class square extends shape{
    public void myType(){
        System.out.println("hi");
    }
}

class circle extends shape{
    public void myType(){
        System.out.println("it's a 3rd class");
    }
}

public class program{
    public static void main(String [] args){
        //polymophic variable
        shape sc1;
        sc1 = new shape();
        sc1.myType();

        sc1 = new square();
        sc1.myType();

        sc1 = new circle();
        sc1.myType();

    }
}