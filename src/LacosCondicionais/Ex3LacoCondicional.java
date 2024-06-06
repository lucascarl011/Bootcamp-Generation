package LacosCondicionais;

import java.util.Scanner;

                         // DOAÇÃO DE SANGUE - EX 03

public class Ex3LacoCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao,apto;

        System.out.println("Digite o nome do doador: ");
        nome = entrada.nextLine();
        System.out.println("Digite a idade do doador: ");
        idade = entrada.nextInt();
        System.out.println("É a sua primeira doação? (true/false): ");
        primeiraDoacao = entrada.nextBoolean();

        apto = false;

        if (idade >= 18 && idade <= 69) {
            if (idade < 60) {
                apto = true;
                System.out.println(nome+",  você está apto(a) para doar sangue!!!");
            }else {
                apto = !primeiraDoacao;
                System.out.println(nome+", você não está apto(a) para doar sangue!!!");
            }
        }
    }
}
