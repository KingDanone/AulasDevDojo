package academy.devdojo.maratonajava.introducao.test;

import academy.devdojo.maratonajava.introducao.dominio.CalculadoraInto;
import java.util.Scanner;

public class CalculadorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculadoraInto calculadora = new CalculadoraInto();


        System.out.print("Digite o primeiro numero: ");
        float num1 = input.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float num2 = input.nextFloat();


        System.out.print("Escolha uma operação: \n 1 - Soma\n 2 - Subtração\n 3 - Multiplicacao\n 4 - Divisão\nSua Escolha: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                calculadora.soma(num1, num2);
                break;
            case 2:
                calculadora.subtracao(num1, num2);
                break;
            case 3:
                calculadora.multiplicacao(num1, num2);
                break;
            case 4:
                calculadora.divisao(num1, num2);
                break;
            default:
                System.out.println("opção invalida, tente novamente!");
                break;
        }

    }

}
