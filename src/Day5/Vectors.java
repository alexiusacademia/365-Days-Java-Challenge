package Day5;import java.util.Scanner;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int elementCount1 = inputs.nextInt();
        int capacityIncrement1 = inputs.nextInt();
        Vector v1 = new Vector(elementCount1, capacityIncrement1);
        int elementCount2 = inputs.nextInt();
        int capacityIncrement2 = inputs.nextInt();
        Vector v2 = new Vector(elementCount2, capacityIncrement2);

        // Dot product
        double dot = dotProduct(elementCount1, capacityIncrement1, elementCount2, capacityIncrement2);
        double lengthOfV1 = vectorLength(elementCount1, capacityIncrement1);
        double lengthOfV2 = vectorLength(elementCount2, capacityIncrement2);
        
        double cosAngle = dot / (lengthOfV1 * lengthOfV2);

        System.out.println(Math.acos(cosAngle) * 180 / Math.PI);
    }

    public static double dotProduct(double vx1, double vy1, double vx2, 
            double vy2) {
        return vx1 * vx2 + vy1 * vy2;
    }
    private static double vectorLength(int vx1, int vy1) {
        double n = Math.pow(vx1, 2) + Math.pow(vy1, 2);
        return Math.sqrt(n);
    }
}