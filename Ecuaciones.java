import java.util.Scanner;

public class Ecuaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escoja los valores para X y Z:");
        System.out.print("X: ");
        double x = sc.nextDouble();

        System.out.print("Z: ");
        double z = sc.nextDouble();

        System.out.println("Escoja cuál ecuación desea hacer (1 o 2): ");
        int opcion = sc.nextInt();

        double y = 0;

        if (opcion == 1) {

            // ECUACIÓN 1 (la larga descompuesta)
            double a = x*x + 3*z + 2;
            double b = 1 + 2*z;
            double c = 1 / b;
            double d = 2 + c;
            double parte1 = a / d;

            double e = 1 + 3*x*x*x + 3*z + 2;
            double numerador2 = 2 / e;
            double f = 1 + 3*x;
            double g = 1 / f;
            double h = 5 / z;
            double i = 1 + h;
            double j = 2*z + 3;
            double k = j / i;
            double l = (3*x + 1) / k;
            double m = g + l;
            double parte2 = numerador2 / m;

            y = parte1 + parte2;

        } else if (opcion == 2) {

            // ECUACIÓN 2 (corrigiendo paréntesis)
            y = (3 * x) /
                (1 + ((3 * x) / (3 * (z * z))) + 2)
                /
                (1 / ((1.0 / 1 + z) + 3 * (x * x) + 2 * z + 3));

        } else {

            System.out.println("Opción no válida.");
        }

        System.out.println("El resultado es: " + y);

        sc.close();
    }
}