package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

import java.util.Scanner;

public class ProfessorTeste02 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Scanner input = new Scanner(System.in);
        professor.nome = input.nextLine();
        professor.idade = input.nextInt();
        input.nextLine();
        professor.sexo = input.next().charAt(0);

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
