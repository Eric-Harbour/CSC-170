import java.util.Scanner;
public class PointLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Point A location
        double aX1 = 100;
        double aY1 = 200;

        // Point B location
        double bX1 = 200;
        double bY1 = 100;

        // Point C location
        double cX1 = 100;
        double cY1 = 100;
        
        // prompt user to enter x and y values --> assign to pX1 and pY1
        System.out.print("Please enter X-coordinate: ");
        double pX1 = input.nextDouble();

        System.out.print("Please enter Y-coordinate:  ");
        double pY1 = input.nextDouble();

        
        // Find area of triangle ABC
        double areaTriangleABC = Math.abs(((aX1 * (bY1-cY1)) + (bX1*(cY1-aY1)) + (cX1*(aY1-bY1))) / 2.0);

        // Find Area of Triangle PBC --> replace aX1, aY1 with pX1, pY1
        double areaTrianglePBC = Math.abs(((pX1 * (bY1-cY1)) + (bX1*(cY1-pY1)) + (cX1*(pY1-bY1))) / 2.0);

        // Find Area of Triangle PAC --> replace bX1, bY1 with aX1, aY1
        double areaTrianglePAC = Math.abs(((pX1 * (aY1-cY1)) + (aX1*(cY1-pY1)) + (cX1*(pY1-aY1))) / 2.0);

        // Find Area of Triangle PAB --> replace cX1, cY1 with bX1, bX2
        double areaTrianglePAB = Math.abs(((pX1 * (aY1-bY1)) + (aX1*(bY1-pY1)) + (bX1*(pY1-aY1))) / 2.0);

        // Check if sum of PBC, PAC, and PAB is same as ABC
        if (areaTrianglePBC + areaTrianglePAC + areaTrianglePAB == areaTriangleABC) {
            System.out.println("The point is in the triangle!");
        }
        else {
            System.out.println("The point is NOT in the triangle!");
        }


    
    }
}