import java.util.Scanner;

public class Invertir {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Cadena invertida: " + textoInvertido);

        scanner.close();
    }
}
