package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as
opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila
0: O programa deve ser finalizado.
Caso a fila esteja vazia, o programa deverá informar que a fila
está vazia ao tentar retirar (chamar) um cliente da fila..
 */

public class Ex1Fila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criação da fila para clientes
        Queue<String> filaClientes = new LinkedList<>();

        int opcao;

        do { // Menu de opções
            System.out.println("\n\t\tSelecione uma opção:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os clientes na fila");
            System.out.println("3: Chamar (retirar uma pessoa da fila)");
            System.out.println("0: Finalizar programa");
            System.out.println("Selecione uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Adicionar um cliente na fila
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente " +nomeCliente + " adicionado à fila!");
                    break;
                case 2:
                    // Listar todos os clientes na fila
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    }else {
                        System.out.println("Clientes na fila: ");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    // Chamar retirar uma pessoa da fila
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    }else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("Cliente " +clienteChamado+ " foi chamado (retirado) da fila.");
                    }
                    break;
                case 0:
                    // Finalizar o programa
                    System.out.println("Finalizando o programa!!!");
                    break;
                default:
                    System.out.println("Opção inválida, escolha outra opção!");
            }
        }while (opcao != 0);


    }
}
