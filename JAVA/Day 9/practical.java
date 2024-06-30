import java.util.Scanner;

public class practical {
    public static void main (String [] args){
        String [] choices = {"Rock","paper","Scisser"};

        int random = (int) Math.floor(Math.random()*3);

        String computerchoice = choices [random];

    System.out.println("Welcome to game");
    System.out.println("-------------------------");
    System.out.println("Rock");
    System.out.println("Paper");
    System.out.println("Scisser");
    System.out.println("Enter your choice");

    Scanner sc = new Scanner(System.in);
    String playchoice = sc.nextLine();

    System.out.println(playchoice);

    switch (playchoice) {
        case "Rock":
            if(computerchoice.equals("Scisser")){
                System.out.println("player WIN");
            }
            else if (computerchoice.equals("Rock")){
                System.out.println("row the match");
            }
            else{
                System.out.println("Computer WIN");
            }
            break;
        case "Paper":
        if(computerchoice.equals("Rock")){
            System.out.println("player WIN");
        }
        else if (computerchoice.equals("Rock")){
            System.out.println("row the match");
        }
        else{
            System.out.println("Computer WIN");
        }
            break;
        case "scisser":
        if(computerchoice.equals("Scisser")){
            System.out.println("player WIN");
        }
        else if (computerchoice.equals("Rock")){
            System.out.println("row the match");
        }
        else{
            System.out.println("Computer WIN");
        }
            break;
    
        default:
            System.out.println("Please enter valid choice");
            break;
    }
    sc.close();
    
    }
}
