import java.util.Scanner;

public class EstadoNumero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número entero:");
        numero = leer.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es neutro");
        }
    }
}