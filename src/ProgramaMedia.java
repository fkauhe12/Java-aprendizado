import java.util.Scanner;

public class ProgramaMedia {
  public static void main(String args[]) {
    try (Scanner ler = new Scanner(System.in)) {
      float media;
      
      System.out.print("Digite seu nome: ");
      String nome = ler.nextLine();
      System.out.print("Digite primeira nota: ");
      float nota1 = ler.nextFloat();
      System.out.print("Digite segunda nota: ");
      float nota2 = ler.nextFloat();
      
      media = (nota1 + nota2) / 2;
      
      System.out.println(nome +" sua media é "+ media);
      
      if(media >= 6){
          System.out.println("Aprovado");
      }else{
           System.out.println("Reprovado");
      }
    }
  }
}