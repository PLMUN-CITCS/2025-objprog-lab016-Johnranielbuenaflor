// Define the class
public class MethodOverloading {

    // Main method
    public static void main(String[] args) {
        printValue(10);       // Calls the method with int parameter
        printValue(3.14);     // Calls the method with double parameter
        printValue("Hello!"); // Calls the method with String parameter
    }

    // Overloaded method for integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Overloaded method for double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Overloaded method for String
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
