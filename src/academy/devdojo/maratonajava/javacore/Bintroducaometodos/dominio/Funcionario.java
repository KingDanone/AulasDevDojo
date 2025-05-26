package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (this.salario == null) {
            return;
        }

        for (double v : this.salario) {
            System.out.println("Salario: " + v);
        }
        mediaDosSalarios();
    }

    private void mediaDosSalarios() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double v : this.salario) {
            media += v;
        }
        System.out.println("Media é :" + (media / this.salario.length));
    }
}
