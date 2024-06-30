class rectangle{
    public double height;
    public double width;

    public rectangle(double height,double width){
        //its a constructor
        this.height=height;
        this.width=width;
    }

    public double area(){
        return height*width;
    }
    public double circumforence(){
        return height*2+width*2;
    }
}
public class basicEX {
    public static void main(String[] args) {
        rectangle sc = new rectangle(10,15);

        System.out.println(sc.height);
    }
}
