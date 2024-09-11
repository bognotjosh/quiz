public class calculator {
    public static int add(int a, int b) {
        return a + b;
     }
     
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Simple Calculator: ");
        System.out.println("Addition: " + add(5, 3)); 
        System.out.println("Subtraction: " + subtract(5, 3));
     }
 }
 