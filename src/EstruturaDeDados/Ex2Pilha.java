package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

/*
Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String,
para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha
0: O programa deve ser finalizado.
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
 */

public class Ex2Pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação da pilha para armazenar livros
        Stack<String> pilhaDeLivros = new Stack<>();

        int opcao;

        do {
            // Menu de opções
            System.out.println("\n\t\tSelecione uma opção:");
            System.out.println("1: Adicionar um livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Busca finalizada! obrigado por utilizar nosso sistema.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Adicionar um livro na pilha
                    System.out.println("Digite o nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    pilhaDeLivros.push(nomeLivro);
                    System.out.println("Livro " + nomeLivro + " adicionado a pilha!");
                    break;
                case 2:
                    // Listar todos os livros da pilha
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    }else {
                        System.out.println("Livros da pilha:");
                        for (String livro : pilhaDeLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    // Retirar livro da pilha
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    }else {
                        String livroRetirado = pilhaDeLivros.pop();
                        System.out.println("Livro '" + livroRetirado + "' foi retirado da pilha!");
                    }
                    break;
                case 0:
                    // Finalizar Sistema
                    System.out.println("Busca finalizada! Obrigado por utilizar nosso sistema.");
                    break;
                default:
                    System.out.println("Opção ecolhida inválida! escolha outra.");
            }
        }while (opcao != 0);
    }
}
