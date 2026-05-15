import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double compra, descuento, total;

        System.out.println("Ingrese el valor de la compra:");
        compra = leer.nextDouble();

        if (compra < 100) {
            descuento = 0;
        } else if (compra >= 100 && compra <= 300) {
            descuento = compra * 0.10;
        } else {
            descuento = compra * 0.15;
        }

        total = compra - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
    }
}