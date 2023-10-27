import java.text.DecimalFormat;
import java.util.Scanner;
//import java.lang.Math;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Definindo DecimalFormat como df e montando a estrutura 
        que o numero vai ser imprimido*/
        DecimalFormat df = new DecimalFormat("###0.00");
      
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        // atribuindo Math.pow() para fazer potenciacao, e so separar pro ","
        double valorTaxa = Math.pow(1 + taxaJuros, periodo);
        
        double valorFinal = valorInicial* valorTaxa;
        
        
        

        
        
        //Declarando uma variavel como string(numeroFormatado) vai ser no lugar de df.format.
        String numeroFormatado = df.format(valorFinal);
        System.out.println("Valor final do investimento: R$ " + numeroFormatado);
        
        scanner.close();
    }
}