public class Day03 {
    static void main(String[] args) {

        int a = 20;
        int b = 10;

        //Arithmetic Operators

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Remainder: " + (a%b));

        //Relational Operators

        System.out.println("a is greater than b: " + (a>b));
        System.out.println("a is equal to b: " + (a==b));

        //Logical Operator

        System.out.println("Both conditions are true: " + (a>10 && b<20));

        //Unary Operators

        a++;
        System.out.println("Value of 'a' after increment: " +a);
    }
}
