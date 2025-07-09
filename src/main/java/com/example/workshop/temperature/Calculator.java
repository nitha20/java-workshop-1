package temperature.beans;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
    
    public int divide(int a,int b) {
        if(b==0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } 
        
    } 
     (ArithmeticException e) {
        System.out.println(e.getMessage());
        return 0; // or handle it as needed
    }
    return a/b;
    
}
