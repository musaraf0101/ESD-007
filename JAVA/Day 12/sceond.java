
class dog{
    private String name;
    private String color;

    public void eat(){
        System.out.println("i can eat");
    }

    //getter and setter method used

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return "Name : "+name+" color : "+color;
    }
}
public class sceond {
    //Encapsulation -> OOP
    public static void main(String [] args){
        dog sc = new dog();
        sc.setName("Hasky");
        sc.setColor("black");
      

        System.out.println(sc.toString());
    }
}
