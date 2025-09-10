import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {
    public static void main(String[] args) {
        exercicio16();
    }

    public static void exercicio16() {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US); // garante ponto como separador decimal se necessário
            
            final int MINUTOS_PERDIDOS_POR_CIGARRO = 10;
            final int MINUTOS_POR_DIA = 24 * 60;

            System.out.print("Quantidade de cigarros fumados por dia: ");
            int cigarrosPorDia = scanner.nextInt();

            System.out.print("Há quantos anos você fuma? ");
            int anosFumados = scanner.nextInt();

            if (cigarrosPorDia < 0 || anosFumados < 0) {
                System.out.println("Valores inválidos. Digite apenas números positivos.");
                return;
            }

            int totalCigarrosFumados = (int) (anosFumados * 365.25 * cigarrosPorDia);
            int totalMinutosPerdidos = totalCigarrosFumados * MINUTOS_PERDIDOS_POR_CIGARRO;
            double totalDiasPerdidos = (double) totalMinutosPerdidos / MINUTOS_POR_DIA;

            System.out.printf("Você fumou aproximadamente %,d cigarros.%n", totalCigarrosFumados);
            System.out.printf("Isso equivale a %,d minutos perdidos.%n", totalMinutosPerdidos);
            System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Ou seja, aproximadamente %.2f dias de vida.%n", totalDiasPerdidos);
        }
    }
}
