public class Parameter {
 
    public static void main(String[] args) {
        String str = "Hello";
           method(str);
    }
 
    public static void method(String strTest) {
        strTest += " World";    
        System.out.println("In method(): " + strTest);
    }
}