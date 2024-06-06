package LacosCondicionais;

import java.util.Scanner;

public class Ex2CondicionalSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo numero: ");
        float numero2 = entrada.nextFloat();

        System.out.println("Digite o numero da operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão):");
        int numeroOperacao = entrada.nextInt();

        float resultado = 0;
        boolean operacao = true;

        switch (numeroOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Operação Adição!");
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Operação Subtração!");
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Operação Multiplicação!");
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Operação Divisão!");
                break;
            default:
                System.out.println("Operação inválida!!!");
        }
            if (operacao) {
                System.out.printf("Resultado %.2f", resultado);
            }


    }
}
