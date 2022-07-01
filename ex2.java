import java.util.Scanner;
public class ex2
{
    public static void main (String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = read.nextInt();
        for (int a = 1, b = 0, i = 0; i <= 100; b = b + a, a = b - a, i++){
            if (a == num | b == num){
                System.out.println("O número pertence à sequência!");
            }
            else
                System.out.println("O número não pertence à sequência!");}
    }
}