package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Estudante estudante = new Estudante();
        estudante.nome = input.nextLine();
        estudante.idade = input.nextInt();
        estudante.sexo = input.next().charAt(0);

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
