import java.util.Scanner;

public class DescuentoFijo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        double compra = leer.nextDouble();
        double descuento = compra * 0.10;
        double total = compra - descuento;
        System.out.println("Monto del descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}
