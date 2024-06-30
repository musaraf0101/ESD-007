import java.util.Scanner;

public class ATMproject {
    static double balance = 10000;

    public static void deposit(double amount){
        if(amount>0){
            balance = balance + amount;
            System.out.println("Deposit success : "+amount);
        }
        else{
            System.out.println("invalid deposit amount");
        }
    }

    public static void checkBalance(){
        System.out.println("your currrent balance is :"+balance);
    }

    public static void Withdraw(double cash){
        if(cash>0){
            if(balance>=cash){
                balance-=cash;
                System.out.println("Withdraw Success");
                System.out.println("your Balnce is : "+balance);
            }
            else{
                System.out.println("Balance Sufficency");
            }
        }
        else{
            System.out.println("Enter Valid Amount");
        }
    }

    
    public static void main(String [] args){

        boolean exit = false;
        while(!exit){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter option");
            System.out.println("1 Deposit");
            System.out.println("2 Balance");
            System.out.println("3 Withdraw");

            System.out.println("Enter the choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.println("Enter the amount to deposit");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    checkBalance();
                    break;

                case 3:
                    System.out.println("Enter the amount to withdraw");
                    double withdrawAmount = sc.nextDouble();
                    Withdraw(withdrawAmount);
                    exit=true;
                    break;

                default:
                    break;
            }
            sc.close();
        }
    }
}
