public class StringBug {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1+str2; // new variable created
        String substring =str3.concat("0, 5");
        
        System.out.println("Substring: " + substring); 
    }
}
