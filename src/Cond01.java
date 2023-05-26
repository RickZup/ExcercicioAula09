import java.util.Scanner;

public class Cond01 {

    public static void main(String[] args) {

        System.out.println("Olá! Esse sistema tem como objetivo fazer o cálculo da folha de pagamento.");
        System.out.println("--------------------------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = entrada.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês referente?");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double taxaIr = 0;

        if (salarioBruto <= 900) {
            taxaIr = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            taxaIr = 0.05;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            taxaIr = 0.10;
        } else {
            taxaIr = 0.20;
        }

        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double impostoRenda = salarioBruto * taxaIr;
        double totalDescontos = impostoRenda + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário bruto: (%.0f * %.0f)               R$ %.2f %n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%)                            R$ %.2f %n", (taxaIr * 100), (salarioBruto * taxaIr));
        System.out.printf("(-) INSS (10%%)                         R$ %.2f %n", inss);
        System.out.printf("FGTS (11%%)                             R$ %.2f %n", fgts);
        System.out.printf("Total de descontos                     R$ %.2f %n", totalDescontos);
        System.out.printf("Salário Líquido                        R$ %.2f %n", salarioLiquido);
    }
}
