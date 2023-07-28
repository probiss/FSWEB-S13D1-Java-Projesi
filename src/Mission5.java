import java.util.Scanner;

import static java.lang.Math.PI;

public class Mission5 {
    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me number: ");
        double radius = scanner.nextDouble();
        double result = area(radius);

        if (result == -1) {
            System.out.println("It can not be a negative number.");
        } else {
            System.out.println("Area is: " + result);
        }
    }
}
