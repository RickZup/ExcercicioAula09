import java.util.Scanner;

public class Cond02 {
    public static void main(String[] args) {
        System.out.println("Esse é um sistema para cálculo de venda de combustível!");
        System.out.println("-------------------------------------------------------");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantos litros de combustível foram vendidos:");
        double litrosVendidos = entrada.nextDouble();

        System.out.println("Qual tipo de combustível foi abastecido?");
        System.out.println("Digite 'A' para álcool e 'G' para gasolina:");
        String tipoAastecido = entrada.next();

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double descontoAlcool = 0;
        double descontoGasolina = 0;
        double precoNormal = 0;
        double precoFinal = 0;


        if (tipoAastecido.equalsIgnoreCase("a")) {
            if (litrosVendidos <= 20) {
                descontoAlcool = (litrosVendidos * precoAlcool) * 0.03;
                precoNormal = litrosVendidos * precoAlcool;
                precoFinal = precoNormal - descontoAlcool;
                System.out.println("O valor a ser pago é de: " + precoFinal);
            } else {
                descontoAlcool = (litrosVendidos * precoAlcool) * 0.05;
                precoNormal = litrosVendidos * precoAlcool;
                precoFinal = precoNormal - descontoAlcool;
                System.out.println("O valor a ser pago é de: " + precoFinal);
            }
        } else if (tipoAastecido.equalsIgnoreCase("g")) {
            if (litrosVendidos <=20){
                descontoGasolina = (litrosVendidos * precoGasolina) * 0.04;
                precoNormal = litrosVendidos * precoGasolina;
                precoFinal = precoNormal - descontoGasolina;
                System.out.println("O valor a ser pago é de: " + precoFinal);
            } else {
                descontoGasolina = (litrosVendidos * precoGasolina) * 0.06;
                precoNormal = litrosVendidos * precoGasolina;
                precoFinal = precoNormal - descontoGasolina;
                System.out.println("O valor a ser pago é de: " + precoFinal);
            }
        }
    }
}
