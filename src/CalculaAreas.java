import java.util.Locale;
import java.util.Scanner;

public class CalculaAreas {
    private static final float pi = 3.14159f;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        float a = teclado.nextFloat();
        System.out.println("Digite o valor de b:");
        float b = teclado.nextFloat();
        System.out.println("Digite o valor de c:");
        float c = teclado.nextFloat();
        float areaDoTrianguloRetangulo = ((a * c) / 2);
        float areaDoCirculo = (float) (pi * (Math.pow(c, 2)));
        float areaDoTrapezio = (((a + b) / 2) * c);
        float areaDoQuadrado = (b * b);
        float areaDoRetangulo = (a * b);
        System.out.printf("Área do triângulo retângulo: %.3f%n", areaDoTrianguloRetangulo);
        System.out.printf("Área do círculo: %.3f%n", areaDoCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaDoTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaDoQuadrado);
        System.out.printf("Área do retângulo: %.3f", areaDoRetangulo);
    }
}
