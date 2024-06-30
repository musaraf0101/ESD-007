public class second {

    public static void printmessage(){
        System.out.println("hi");
        System.out.println("welcome team");
        System.out.println("have a grate day");
    }

    public static int number(){
        int x = 5;
        return x;
    }

    public static double circle(double length){
        double area = length*length;
        return area;
    }

    public static double rectangle(double height,double length){
        double area = length*height;
        return area;
    }

    public static void main(String [] args){

        printmessage();
        System.out.println(circle(10));
        System.out.println(rectangle(10, 15));
        
    }
}
