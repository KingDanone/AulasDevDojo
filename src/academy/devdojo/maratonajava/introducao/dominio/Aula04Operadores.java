package academy.devdojo.maratonajava.introducao.dominio;

public class Aula04Operadores {
    public static void main(String[] args) {

        // operadores: + | - | * | / | = |

        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 + numero2;

        System.out.println("Resultado: " + resultado);

        /*
        * --------------------------------------------------
        * */

        // %

        int resto = 20 % 2;
        System.out.println("resto: " + resto);

        /**
         *
         * -----------------------------------
         */

        //  > (maior q) | < (menor q) | <= | >= | == | !=

        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDifenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDifenteDeDez: " + isDezDifenteDeDez);


    }
}
