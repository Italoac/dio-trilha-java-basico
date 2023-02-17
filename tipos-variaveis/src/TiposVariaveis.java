public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //Testando short para int e int para short e usando cast
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //Testando Long
        long totalPopulacao = 801706837400L;
        System.out.printf("Mostre o total da população mundial: %d", (totalPopulacao));

        
        //Testando String
        String nome = "Ítalo";
        String sobrenome = "Marshal";
        System.out.printf("\nSeu nome completo: " + nome + " " + sobrenome);

        //Testando char
        char opcaoSim = 'S';
        char opcaoNao = 'N';

        System.out.printf("\nMiguel é mulher? %c", opcaoNao);
        System.out.println("\nAmanda é mulher? " + opcaoSim);


        //Exemplo de variável constante
        int numero = 5;
        numero = 10;

        System.out.printf("\nNúmeros inteiros %d\n", numero);

        final double VALOR_DE_PI = 3.14;
    }
}
