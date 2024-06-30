
class invalidAgeException extends Exception{

    public invalidAgeException(String message){
        super(message);
    }
}
public class examplea {
    public static void main(String[] args) {
        try{
            int x = 18;

            if (x<18) {
                throw new invalidAgeException("Age must be 18");
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
