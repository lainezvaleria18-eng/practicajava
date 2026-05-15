import java.util.Scanner;

public class AreaRectangulo { public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese la base: ");
    double base = leer.nextDouble();
    System.out.print("Ingrese la altura: ");
    double altura = leer.nextDouble();
    double area = base * altura;
    System.out.println("El área del rectángulo es: " + area);
}
}
