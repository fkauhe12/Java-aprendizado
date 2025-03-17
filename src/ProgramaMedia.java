import java.util.Scanner;

public class ProgramaMedia {
  public static void main(String args[]) {
    try (Scanner ler = new Scanner(System.in)) {
      float media;
      
      System.out.println("Digite seu nome: ");
      String nome = ler.nextLine();
      System.out.println("Digite primeira nota: ");
      float nota1 = ler.nextFloat();
      System.out.println("Digite segunda nota: ");
      float nota2 = ler.nextFloat();
      
      media = (nota1 + nota2) / 2;
      
      System.out.println(nome +" sua media é "+ media);
    }
  }
}