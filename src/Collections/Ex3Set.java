package Collections;

/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros
não repetidos e adicione-os individualmente na Collection Set.
Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.
Veja o exemplo abaixo:
 */
import java.util.*;

public class Ex3Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> integerSet = new HashSet<>();

        System.out.println("Digite 10 valores interiros não repetidos: ");
        while (integerSet.size() <10) {
            System.out.println("Valor " + (integerSet.size() + 1) + ": ");
            int valor = sc.nextInt();

            if (!integerSet.add(valor)) {
                System.out.println("Valor inválido, insira um valor diferente!");
            }
        }

        System.out.println("\nElementos do Set: ");
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
