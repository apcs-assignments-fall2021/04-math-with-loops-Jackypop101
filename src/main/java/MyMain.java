import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double fact = 1;
        while (x>0) {
            fact = fact * x;
            x = x - 1;

        }
        return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double w = 0;
        int j = 0;
        while (Math.abs(w - Math.E) > 0.00000000001){
            w = w + 1 / factorial(j);
            j ++;
        }
        return w;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 7.0;
        double m = 0;
        while (true) {
            m = (n + x / n) / 2;
            if (Math.abs(m - n) <= 0.00001) {
                return m;
            } else {
                n = m;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        double x = scan.nextDouble();
        int b = (int) x ;
        System.out.println("The factorial of " + x + " is " + factorial(b));
        System.out.println("The square root of " + x + " is " + babylonian(x));
        System.out.println("The value of e is roughly : " + calculateE());

  /*
  * Enter a positive number!
125
The squareroot of 125.0 is 11.18033988749989
The value of e is roughly : 2.71828182845823
  * */
        // YOUR CODE HERE


        

        scan.close();
    }
}
