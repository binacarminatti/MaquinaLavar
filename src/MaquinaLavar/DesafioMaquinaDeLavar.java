/**
 * 
 */
package MaquinaLavar;

import java.util.Scanner;

/**
 * @author Pichau
 *
 */
public class DesafioMaquinaDeLavar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("========================================");
		System.out.println("           MENU DE SIMULA��O");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a m�quina de lavar");
		System.out.println("[2] - Simular a m�quina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o c�digo:");
		
		int codigo = entrada.nextInt();
		
		if (codigo == 1) {
			System.out.println("==========================================");
			System.out.println("     CONFIGURAR DA M�QUINA DE LAVAR");
			System.out.println("==========================================");
			System.out.println("Modelo: ");
			String modelo = entrada.nextLine();
			entrada.nextLine();			
			System.out.println("Nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Voltagem:");
			int voltagem = entrada.nextInt();
			System.out.println("Quantos kg?");
			int kg = entrada.nextInt();
			System.out.println("Dua��o est�gio 1 - Lava��o Pesada: ");
			int pesada = entrada.nextInt();
			System.out.println("Dua��o est�gio 2 - Lava��o Normal: ");
			int normal = entrada.nextInt();
			System.out.println("Dua��o est�gio 3 - Lava��o R�pida: ");
			int rapida = entrada.nextInt();
			System.out.println("Dua��o est�gio 4 - Enxague: ");
			int enxague = entrada.nextInt();
			System.out.println("Dua��o est�gio 5 - Centrifuga��o: ");
			int centrifugacao = entrada.nextInt();
			
			System.out.println("==========================================");
			System.out.println("     CONFIGURA��O DA M�QUINA DE LAVAR");
			System.out.println("==========================================");
			
			System.out.println("Modelo: " + modelo);
			System.out.println("Nome: " + nome);
			System.out.println("Voltagem: " + voltagem);
			System.out.println("Quantos kg: " + kg);
			System.out.println("Dua��o est�gio 1 - Lava��o Pesada: " + pesada);
			System.out.println("Dua��o est�gio 2 - Lava��o Normal: " + normal);
			System.out.println("Dua��o est�gio 3 - Lava��o R�pida: " + rapida);
			System.out.println("Dua��o est�gio 4 - Enxague: " + enxague);
			System.out.println("Dua��o est�gio 5 - Centrifuga��o: " + centrifugacao);
			
			System.out.println("Confirmar configura��o da m�quina? sim/n�o");
			String resposta = entrada.nextLine();
				if (resposta.equals("sim")) {
					System.out.println("========================================");
					System.out.println("           MENU DE SIMULA��O");
					System.out.println("========================================");
					System.out.println("[1] - Configurar a m�quina de lavar");
					System.out.println("[2] - Simular a m�quina de lavar");
					System.out.println("[0] - Sair");
					System.out.println("Digite o c�digo:");
				}
			
			
		}
		
		
		
	}

}
