import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args ) {
        // Classe scanner para entrada de dados
        Scanner ler = new Scanner(System.in);
        
        // Entrada de dados Nome e Idade e Peso
        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite a idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite peso: ");
        double peso = ler.nextDouble();


        // Declaração de variáveis
        double altura = 1.80;
        char sexo = 'M';
        boolean casado = false;
        

        // Impressão de variáveis ( ln pula linha )
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Casado: " + casado);

    }
}