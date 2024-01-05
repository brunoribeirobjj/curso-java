package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "azul";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sabe dar chave de pé");
		case "marrom":
			System.out.println("Sabe dar chave de joelho");
		case "roxa":
			System.out.println("Sabe dar chave de tornozelo");
		case "azul":
			System.out.println("Sabe estrangular");
			break;
		default:
			System.out.println("Sabe fazer força");
		
		}
		
		System.out.println("Fim");
		
		int idade = 2;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe correr");
		case 1:
			System.out.println("Sabe andar");
		}
		
	}

}
