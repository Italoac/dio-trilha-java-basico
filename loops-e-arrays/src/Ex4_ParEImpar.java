import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.print("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int contador = 0;
        
        do{
            System.out.print("\nNúmero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            contador++; //contador++ é igual: contador = contador + 1;

        }while(contador < quantidadeNumeros);

        System.out.println("\nQuantidade de Par: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);

    }
}
