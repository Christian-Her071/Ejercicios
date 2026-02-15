import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("===== CALCULADORA BÁSICA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {

                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                            continue;
                        }
                        break;
                }

                System.out.println("Resultado: " + resultado);
                System.out.println();
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
