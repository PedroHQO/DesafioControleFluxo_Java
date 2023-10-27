import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    //Objeto para receber a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    
    //Inicializa um ArrayList chamado ativos para armazenar os códigos dos ativos.
    ArrayList < String > ativos = new ArrayList <  String > ();

    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();/*para consumir a quebra de linha após a leitura do número de ativos, 
    permitindo que a próxima leitura da linha funcione corretamente.*/
  
    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);//Pega os ativos digitados adiciona em ativos
      
    }
    
    Collections.sort(ativos);//Utiliza Collections.sort() para ordenar a lista em ordem alfabética.
    
    // Imprimir a lista de ativos ordenada
    for(String ativo : ativos){
      System.out.println(ativo);
    }

    //TODO: Ordenar os ativos em ordem alfabética.
    

    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
  }

}