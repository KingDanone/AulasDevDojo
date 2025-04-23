package academy.devdojo.maratonajava.introducao.dominio;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean


        int idade = (int) 10000000000L;
        long numeroGrande = (long) 255.23;
        double salarioDouble = 2000.00;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'R';
        String nome = "Goku";


        System.out.println("idade "+idade);
        System.out.println("boolean " + verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(numeroGrande);
        System.out.println("oi meu nome é "+nome);

    }
}
