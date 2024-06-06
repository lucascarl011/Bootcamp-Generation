package LacosCondicionais;

import java.util.Scanner;

public class Ex1CondicionalSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String produto;
        int preco;

        System.out.println("Digite o código do item: ");
        int codigo = entrada.nextInt();
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                preco = (int) 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = (int) 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = (int) 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = (int) 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = (int) 8.00;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = (int) 13.00;
                break;
            default:
                System.out.println("Código inválido! Por favor, tente novamente.");
                return;
        }

        float valorTotal = preco * quantidade;

        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Valor total: R$ %.2f", valorTotal);

    }
}
