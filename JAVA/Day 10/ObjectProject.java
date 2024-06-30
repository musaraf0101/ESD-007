import java.util.Scanner;
public class ObjectProject {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("choice the type of object");
        System.out.println("1 rectangle");
        System.out.println("2 Square");
        System.out.println("3 Triangle");
        System.out.println("4 Circle");

        System.out.print("Enter the choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the dimension of the Rectangle");
                System.out.println("---------------------------------");
                System.out.println("Enter the Width");
                int rwidth = sc.nextInt();
                System.out.println("Enter The Height");
                int rHeight = sc.nextInt();
                int rarea = rHeight*rwidth;
                System.out.println("Area is : "+rarea);
                break;
            case 2:
                System.out.println("Enter the dimension of the Square");
                System.out.println("---------------------------------");
                System.out.println("Enter the length");
                int sHeight = sc.nextInt();
                int sarea = sHeight*sHeight;
                System.out.println("Area is : "+sarea);
                break;
            case 3:
                System.out.println("Enter the dimension of the Trianle");
                System.out.println("---------------------------------");
                System.out.println("Enter Height");
                int tHeight = sc.nextInt();
                System.out.println("Enter base");
                int tbase = sc.nextInt();
                double tarea = (tbase* tHeight)*0.5;
                System.out.println("area is : "+ tarea);
                break;
            case 4:
                System.out.println("Enter the dimension of the circle");
                System.out.println("------------------------------");
                System.out.println("Enter circle radius");
                int radius = sc.nextInt();
                double PI = 3.14;
                double carea = PI*radius*radius;
                System.out.println("Area is : "+carea);
        
            default:
                System.out.println("Enter Valid choice");
                break;
        }

        sc.close();
    }
}