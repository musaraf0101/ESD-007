public class DataTypeBug {
    public static void main(String[] args) {
        int a = 10;
        double b = 4.5;
        boolean isTrue = true;
        char letter = 'C';
        double result = a + b;
        boolean isEqual = (a == b);
        boolean asciiValue = (boolean) isTrue; // Incorrect type casting
        
        System.out.println("Result: " + result);
        System.out.println("isEqual: " + isEqual);
        System.out.println("Ascii value of 'C': " + asciiValue);
        System.out.println("Letter : "+letter); //warning message removed
        }
       
}
