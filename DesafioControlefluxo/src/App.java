import java.text.DecimalFormat;
public class App {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("#,##0.00");
      
   
        double valorInicial = 5000.0;
        
     
        double taxaJuros = 0.08;
        
        int periodo = 10;
        
        double valorTaxa = Math.pow(1 + taxaJuros, periodo);
        
        double valorFinal = valorInicial* valorTaxa;
        
        
        

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        String numeroFormatado = df.format(valorFinal);

        System.out.println("Valor final do \ninvestimento: R$ " + numeroFormatado);
        
        //scanner.close();
}
}
