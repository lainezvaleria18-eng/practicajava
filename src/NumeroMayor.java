import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Ingrese primer número:");
        n1 = leer.nextInt();
        System.out.println("Ingrese segundo número:");
        n2 = leer.nextInt();
        System.out.println("Ingrese tercer número:");
        n3 = leer.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El mayor es: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("El mayor es: " + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
}