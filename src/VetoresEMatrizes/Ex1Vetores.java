package VetoresEMatrizes;

import java.util.Scanner;

/*
Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
construa um algoritmo que consiga pesquisar dados no vetor,
onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela
 */
public class Ex1Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = {2,5,1,3,4,9,7,8,10,6};
        int n;
        boolean encontrado = false;

        System.out.println("Digite o numero que deseja verificar: ");
        n = sc.nextInt();

        for (int i = 0; i < vet.length;i++) {
            if (n == vet[i]) {
                System.out.println("O numero "+ (n) + " está na posição "+(i));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O numero "+ n +" não foi encontrado!");
        }

    }
}
