
class animal{
    public String color;
    public double weight;
    public String name;

    public animal(){

    }

    public animal(String color,double weight,String name){
        this.color = color;
        this.weight = weight;
        this.name = name;
    }
}

class dog extends animal{
    public String bread;

    public dog(String bread,String color,double weight,String name){
        super(bread,weight,color);
        this.bread=bread;
    }

    public void run(){
        System.out.println("i can run");
    }
}

class cat extends animal{

    //OR create empty constructor in parent class

    /*public cat(String color,double weight,String name){
        super(color, weight, name);
    }*/

    public void jump(){
        System.out.println("I can jump");
    }
}
public class first{
    //Encapsulation -> OOP
    public static void main(String [] args){
        dog sc = new dog("pitbul","black",0,"hasky");
        sc.name="hasky";
        //sc.bread = "pitbul";

        cat dc = new cat();
        dc.name="cat";

        System.out.println(sc.name);
        System.out.println(dc.name);

    }
}