class Dog{
    public String name;
    public String color;
    public String bread;

    public void eat(){
        System.out.println("i can Eat dog foods");
    }
}

public class basic{
    public static void main(String [] args){
        //OOP

        Dog togo = new Dog();
        togo.name = "Togo";
        togo.color = "black";
        togo.bread = "haski";

        System.out.println(togo.name+ "color is "+togo.color+"bread is "+togo.bread);

        Dog scoby = new Dog();
        scoby.name="scoby";

        System.out.println(scoby.name);
        scoby.eat();
    }
}