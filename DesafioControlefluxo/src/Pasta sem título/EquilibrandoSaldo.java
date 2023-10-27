import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldoAtualizado = 0;

        System.out.println("Digite seu saldo atual: ");
        double saldoAtual = scanner.nextDouble();
        
        System.out.println("Digite o valor do valorDeposito: ");
        double valorDeposito = scanner.nextDouble();
        
        System.out.println("Digite o valor do saque: ");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       
       saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println(String.format("Resta em sua conta: %.1f $" + saldoAtualizado));
      
    }
}