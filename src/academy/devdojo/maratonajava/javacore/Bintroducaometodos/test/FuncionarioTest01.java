package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Saitama";
        funcionario1.idade = 27;
//        funcionario1.salario = new double[]{1000, 2000, 3000};

        funcionario1.imprime();
//        System.out.println("Media é :" + funcionario1.mediaDosSalarios());

    }
}
