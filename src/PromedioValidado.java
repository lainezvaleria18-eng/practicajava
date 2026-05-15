import java.util.Scanner;

public class PromedioValidado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n1, n2, n3, prom;

        System.out.println("Ingrese nota 1:");
        n1 = leer.nextDouble();
        System.out.println("Ingrese nota 2:");
        n2 = leer.nextDouble();
        System.out.println("Ingrese nota 3:");
        n3 = leer.nextDouble();

        if ((n1 >= 0 && n1 <= 10) && (n2 >= 0 && n2 <= 10) && (n3 >= 0 && n3 <= 10)) {
            prom = (n1 + n2 + n3) / 3;
            if (prom >= 6) {
                System.out.println("Aprobado con promedio de: " + prom);
            } else {
                System.out.println("Reprobado con promedio de: " + prom);
            }
        } else {
            System.out.println("Error: Las notas deben estar entre 0 y 10.");
        }
    }
}