package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.salario != null){
            for (int i = 0; i < this.salario.length; i++) {
                System.out.println("Salario: " + this.salario[i]);
            }
        }

    }

    public double mediaDosSalarios(){
        double media = 0;
        for (int i = 0; i < this.salario.length; i++) {
            media = media + this.salario[i];
        }
        return media / this.salario.length;
    }
}
