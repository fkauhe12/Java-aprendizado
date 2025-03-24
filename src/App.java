public class App {
    public static void main(String[] args) {
    //declarando variavel do tipo conta
     Conta minhaConta;
    //instanciando objeto do tipo conta
    
    minhaConta = new Conta();
    Conta suaConta = new Conta();
    
    //atribuindo valores aos atributos do objeto minhaConta
    minhaConta.numero = 30;
    minhaConta.nomeTitular = "Felipe";
    minhaConta.saldo = 1000.0;

    suaConta.numero = 40;
    suaConta.nomeTitular = "Maria";
    suaConta.saldo = 2000.0;

    //acessando os atributos do objeto minhaConta
    System.out.println("=== Minha Conta ===");
    System.out.println("Número da conta: "+ minhaConta.numero);
    System.out.println("Titular: "+ minhaConta.nomeTitular);
    System.out.println("Saldo atual: "+ minhaConta.saldo);  
    
    System.out.println("=== Sua Conta ===");
    System.out.println("Número da conta: "+ suaConta.numero);   
    System.out.println("Titular: "+ suaConta.nomeTitular);
    System.out.println("Saldo atual: "+ suaConta.saldo);

    }
}
