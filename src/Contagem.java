import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = input.nextInt();

        System.out.print("Digite os valores do conjunto de dados separados por espaços: ");
        String conjunto = input.nextLine();
        conjunto = input.nextLine(); // Lê a entrada como string e descarta o enter
        String[] numeros = conjunto.split(" ");

        int primeiroDado = Integer.parseInt(numeros[0]);
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(numeros[i]);
            if (numero >= primeiroDado && numero <= n) {
                contador++;
            }
        }

        System.out.println("Existem " + contador + " valores inteiros entre " + primeiroDado + " e " + n + ".");
    }
}
