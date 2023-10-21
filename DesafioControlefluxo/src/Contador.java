import java.util.Scanner;

// class representing custom exception  
class ParametrosInvalidosException  extends Exception  
{  
    public ParametrosInvalidosException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

//classe main
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);//Defining library scanner with terminal
		System.out.println("Digite o primeiro parâmetro");//Write first parameter 
		int parametroUm = terminal.nextInt();//read variable and carry your value
		System.out.println("Digite o segundo parâmetro");//Write second parameter
		int parametroDois = terminal.nextInt();//read variable and carry tou value

        
		
		try {
			//callig method for count
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//print the mensage: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro! ");

			System.out.println("Digitar o segundo parâmetro maior que o primeiro!");
		}
		
	}
	//method that check parametroUm, parametroDois
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
			//throw an object of user defined exception(lançar um objeto de exceçao definida pelo o usuario) 
			throw new ParametrosInvalidosException("Erro: O segundo parâmetro deve ser maior que o primeiro"); 
        }
		else{
				int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem 
			for(int i = 1; i <= contagem; i++){
				System.out.println(i);
			}
	}
	}
}
