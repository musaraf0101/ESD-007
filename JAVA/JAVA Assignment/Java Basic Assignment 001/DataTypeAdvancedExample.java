public class DataTypeAdvancedExample {
    public static void main(String[] args) {
        int a = 10;
        double b = 4.5;
        boolean isTrue = true;
        char letter = 'C';
        
        double result = a + b;
        boolean isEqual = (a == b);
        int asciiValue = (int) letter;
        
        System.out.println("Result: " + result);
        System.out.println("isEqual: " + isEqual);
        System.out.println("Ascii value of 'C': " + asciiValue);
        System.out.println("isTure : "+isTrue); //warning removed
        
        // Attempting invalid conversion
        String str = "Hello";
        double invalidResult = Double.parseDouble(str); // This line should be corrected
        System.out.println("Invalid Result: " + invalidResult);
        }
}
