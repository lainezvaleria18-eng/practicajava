import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double nota1, nota2, nota3, prom;

        System.out.println("Ingrese nota 1:");
        nota1 = leer.nextDouble();
        System.out.println("Ingrese nota 2:");
        nota2 = leer.nextDouble();
        System.out.println("Ingrese nota 3:");
        nota3 = leer.nextDouble();

        prom = (nota1 + nota2 + nota3) / 3;

        if (prom >= 6) {
            System.out.println("Usted está aprobado, su promedio es: " + prom);
        } else {
            System.out.println("Usted está reprobado, su promedio es: " + prom);
        }
    }
}