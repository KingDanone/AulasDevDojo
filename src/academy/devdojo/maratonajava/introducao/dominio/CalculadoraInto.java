package academy.devdojo.maratonajava.introducao.dominio;

public class CalculadoraInto {

    public void somar(double num1, double num2) {
        System.out.println("Resultado: " + (num1 + num2));
    }
    public void subtrair(double num1, double num2) {
        System.out.println("Resultado: " + (num1 - num2));
    }
    public void multplicar(double num1, double num2) {
        System.out.println("Resultado: " + (num1 * num2));
    }
    public void dividir(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não pode dividir por 0 zé");
        }else{
            System.out.println("Resultado: " + (num1 / num2));
        }
    }
}