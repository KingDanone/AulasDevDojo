package academy.devdojo.maratonajava.introducao.test;

import academy.devdojo.maratonajava.introducao.dominio.CalculadoraInto;
import java.util.Scanner;

public class CalculadorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraInto obj = new CalculadoraInto();

        System.out.println("ESCOLHA A OPERAÇÃO!\n 1 - soma\n 2 - subtração\n 3 - multiplicação\n 4 - divisão\nEscolha: ");
        int operacao = sc.nextInt();

        System.out.print("valor: ");
        double num1 = sc.nextDouble();
        System.out.print("valor: ");
        double num2 = sc.nextDouble();

        switch (operacao) {
            case 1:
                obj.somar(num1, num2);
                break;
            case 2:
                obj.subtrair(num1, num2);
                break;
            case 3:
                obj.multplicar(num1, num2);
                break;
            case 4:
                obj.dividir(num1, num2);
                break;
            default:
                System.out.println("erro 404");
                break;
        }
    }
}