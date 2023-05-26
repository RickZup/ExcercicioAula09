import java.util.Scanner;

public class Cond03 {
    public static void main(String[] args) {

        System.out.println("Bom, precisamos te fazer algumas perguntas...");
        System.out.println("Fique tranquilo e responda com calma, okay?");
        System.out.println("Responda somente com 'S' para 'Sim' e 'N' para 'Não'.");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Você telefonou para a vítima?");
        String resposta1 = entrada.next();

        System.out.println("Entendo... Esteve no local do crime?");
        String resposta2 = entrada.next();

        System.out.println("Agora diga, você mora perto da vítima?");
        String resposta3 = entrada.next();

        System.out.println("Hm... Devia algo para a vítima?");
        String resposta4 = entrada.next();

        System.out.println("Estamos quase acabando, você já trabalhou com a vítima?");
        String resposta5 = entrada.next();

        int quantidadeSim = 0;

        if(resposta1.equalsIgnoreCase("s")){
            quantidadeSim++;
        }
        if(resposta2.equalsIgnoreCase("s")){
            quantidadeSim++;
        }
        if(resposta3.equalsIgnoreCase("s")){
            quantidadeSim++;
        }
        if(resposta4.equalsIgnoreCase("s")){
            quantidadeSim++;
        }
        if(resposta5.equalsIgnoreCase("s")){
            quantidadeSim++;
        }

        if(quantidadeSim == 2 ){
            System.out.println("Você pode ir, mas por favor, não saia da cidade, okay? (Suspeito)");
        } else if (quantidadeSim >= 3 && quantidadeSim <= 4) {
            System.out.println("Bem, parece que teremos que fazer mais algumas ligações... (Cúmplice)");
        } else if (quantidadeSim == 5) {
            System.out.println("Fique aqui, eu já volto. (Assassino0");
        } else {
            System.out.println("Bem, parece que está tudo okay. Pode ir. Entre em contato caso lembre de algo. (Inocente)");
        }

    }
}
