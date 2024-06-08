package VetoresEMatrizes;

import java.util.Scanner;

public class Ex3Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaDiagPrin=0;
        int somaDiagSecun=0;

        System.out.println("Digite os elementos da matriz 3x3: ");
        for (int i = 0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]+ "");
            somaDiagPrin += matriz[i][i];
        }

        System.out.println("Elementos da diagonal secundária: ");
        for (int j = 0; j < 3; j++) {
            System.out.println(matriz[j][2- j]+ " ");
            somaDiagSecun += matriz[j][2 - j];
        }

        System.out.println("\nSoma dos elementos da diagonal principal: "+ somaDiagPrin);
        System.out.println("\nSoma dos elementos da diagonal secundária: "+ somaDiagSecun);
    }
}
