 import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double root1, root2;
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f\n", root1);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f + %.2fi\n", real, imaginary);
            System.out.format("root2 = %.2f - %.2fi\n", real, imaginary);
        }

        scanner.close();
    }
}
