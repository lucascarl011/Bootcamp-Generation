package JavaBasico;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float salario,abono,novoSalario;

        System.out.println("Digite seu Salario: ");
        salario = entrada.nextFloat();
        System.out.println("Digite seu abono: ");
        abono = entrada.nextFloat();

        novoSalario = salario + abono;

        System.out.printf("Seu novo Salario é: "+ novoSalario);
    }

}
