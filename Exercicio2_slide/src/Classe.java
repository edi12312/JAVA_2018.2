
import java.util.Scanner;
public class Classe {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int ano_nasc;
		int idade;
		
		System.out.println("Informe o ano de nascimento: ");
		ano_nasc = leitor.nextInt();
		
		idade = 2018 - ano_nasc;
		
		System.out.println("Sua idade é: " + idade);
		
		leitor.close();
	}

}
