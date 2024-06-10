package Collections;

import java.util.*;

/*
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e
deverá adicioná-las individualmente no ArrayList.
Em seguida, faça o que se pede:
e.Mostre na tela todas as cores que foram adicionadas.
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente
 */

public class Ex1ArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        System.out.println("Digite 5 cores: ");
        for (int i = 0; i < 5;i++) {
            System.out.println("Cor " + (i+1) + ": ");
            String cor = sc.nextLine();
            cores.add(cor);
        }

        System.out.println("\nCores adicionadas: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\nCores ordenadas em ordem crescente: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
