package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "BMW";
        carro1.nome = "BMW";
        carro1.ano = 2017;
        System.out.println(carro1.modelo + " " + carro1.nome + " " + carro1.ano);

        System.out.println("----------------------------");

        carro2.modelo = "Chevrollet";
        carro2.nome = "Classic";
        carro2.ano = 2014;
        System.out.println(carro2.modelo + " " + carro2.nome + " " + carro2.ano);
    }
}
