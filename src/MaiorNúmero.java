import java.util.Scanner;

public class MaiorNúmero {
    public static void main(String args[]) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int num1 = ler.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = ler.nextInt();
            if(num1 > num2){
                System.out.println("O maior número é: "+ num1);
            }else{
                System.out.println("O maior número é: "+ num2);
            }
        }
    }
}