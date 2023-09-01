import java.util.InputMismatchException;
import java.util.Scanner;

public class DeducaoImpostoRenda {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double rendaMensal;
            double imposto;

            System.out.println("Informe o valor de sua renda mensal já descontada o INSS:");
            rendaMensal = scanner.nextDouble();

            imposto = calcularImposto(rendaMensal);
            System.out.println("O valor do imposto mensal é: " + imposto);
            imposto = imposto * 12;
            System.out.println("O valor do seu imposto anual é: " + imposto);
        } catch (InputMismatchException e) {
            System.out.println("Parece que você colocou uma vírgula ao invés de um ponto. Por favor, corrija.");
        }
    }

    static double calcularImposto(double rendaMensal) {
        double imposto = 0;
        if (rendaMensal <= 1903.98) {
            imposto = 0;
        } else if (rendaMensal <= 2826.65) {
            imposto = (rendaMensal * 0.075) - 142.80;
        } else if (rendaMensal <= 3751.05) {
            imposto = (rendaMensal * 0.15) - 354.80;
        } else if (rendaMensal <= 4664.68) {
            imposto = (rendaMensal * 0.225) - 636.13;
        } else {
            imposto = (rendaMensal * 0.275) - 869.36;
        }
        return imposto;
    }
}
