import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Didite o numero limite para a sequecia de Fibonacci");
        int limite = input.nextInt();

        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        while (proximo <= limite){
            System.out.print(proximo + " ");

            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }
    }
}
