public class Operadores {
    public static void main(String[] args) {
        
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        //qual o resultado das expressões  abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = "1" +(1+1+1);
        System.out.println(concatenacao);

        /*Ternário: Operador de Condição Ternário é uma forma resumida para definir uma condição e escolher por um dentre dois valores..Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
 */
        
        //Exemplo de condição sem usa o operador ternário
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado); 

        //Simplificando código com operador ternário
        int a1, b1;
        a1 = 5;
        b1 = 5;

        String resultado1 = a1==b1 ? "verdadeiro" : "falso"; //Simplificando o código com operadores ternário

        System.out.println("Utilizando operador ternário: " + resultado1); 
    
        //OPERADORES RELACIONAIS
        System.out.println("\nOPERADORES RELACIONAIS");
        int numero1 = 1;
        int numero2 = 2;

        //Operador Relacional Igual ==
        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        //Operador Relacional Diferente !=
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente numero2? " + simNao);

        //Operador Relacional Maior >
        simNao = numero1 > numero2;
        System.out.println("numero1 é maior numero2? " + simNao);

        //Operador Relacional Maior Iguak >=
        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual numero2? " + simNao);

        //Operador Relacional Menor <
        simNao = numero1 < numero2;
        System.out.println("numero1 é menor numero2? " + simNao);

        //Operador Relacional Menor ou Igual <=
        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual numero2? " + simNao);

        /* Operadores de Lógicos */
        System.out.println("\n### Operadores de Lógicos ###");
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras? ");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira? ");

        }
    
    }
}
