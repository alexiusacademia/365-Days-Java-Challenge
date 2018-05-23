package Day4;// You have been given the real numbers a, b, c, where a ≠ 0.
// Solve the quadratic equation ax2+bx+c=0 and output all of its roots.
// It is guaranteed that the equation always has two roots.
// Output the results roots in ascending order. Do not round or format them, the testing system does it automatically.
// Sample Input 1:
// 1
// -1
// -2
// Sample Output 1:
// -1 2
// Sample Input 2:
// 1
// -7.5
// 3
// Sample Output 2:
// 0.423966 7.07603

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        double a = inputs.nextDouble();
        double b = inputs.nextDouble();
        double c = inputs.nextDouble();
        
        // Ax2 + Bx + C = 0
        double x = 1.0;
        double sum = 1.0;
        
        double d;
        d = Math.pow(b, 2) - 4 * a * c;
        
        double root1, root2;
        
        root1 = (-b - Math.sqrt(d)) / (2 * a);
        root2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println(Math.min(root1, root2) + " " + Math.max(root1, root2));
    }
}