import java.util.Scanner;
public class ex5{
    public static void main (String args[]){
        Scanner read = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = read.next();
        int len = word.length();

        char[] tempCharArray = new char[len];
        char[] Array = new char[len];

        for (int i = 0; i < len; i++){
            tempCharArray [i] = word.charAt(i);
        }
            
        for (int j = 0; j < len; j++){
            Array[j] = tempCharArray[len - 1 - j];
        }
        
        String reverseWord = new String(Array);
        System.out.println(reverseWord);
}}
