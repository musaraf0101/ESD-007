

public class example {
    public static void main(String[] args) {
        
    try{
        int [] a = new int [5];
        a[6] = 10;
    }
    catch(Exception e){
        System.out.println(e.toString());
    }
    finally{
        System.out.println("alwasy working");
    }
    System.out.println("i am here");
   
    }
}
