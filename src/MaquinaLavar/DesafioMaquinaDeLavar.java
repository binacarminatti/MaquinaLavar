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
		int resposta, voltagem, kg, pesada, normal, rapida, enxague, centrifugacao;
		String modelo;
		String nome;
				
		if (codigo == 1) {
			do {
			System.out.println("==========================================");
			System.out.println("     CONFIGURAR DA M�QUINA DE LAVAR");
			System.out.println("==========================================");
			System.out.println("Modelo: ");
			modelo = entrada.nextLine();
			entrada.nextLine();			
			System.out.println("Nome: ");
		    nome = entrada.nextLine();
			
			System.out.println("Voltagem:");
			voltagem = entrada.nextInt();
			System.out.println("Quantos kg?");
			kg = entrada.nextInt();
			System.out.println("Dua��o est�gio 1 - Lava��o Pesada: ");
			pesada = entrada.nextInt();
			System.out.println("Dua��o est�gio 2 - Lava��o Normal: ");
			normal = entrada.nextInt();
			System.out.println("Dua��o est�gio 3 - Lava��o R�pida: ");
			rapida = entrada.nextInt();
			System.out.println("Dua��o est�gio 4 - Enxague: ");
			enxague = entrada.nextInt();
			System.out.println("Dua��o est�gio 5 - Centrifuga��o: ");
			centrifugacao = entrada.nextInt();
			
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
			
			System.out.println("Confirmar configura��o da m�quina? Digite 1 para sim/2 para n�o");
			resposta = entrada.nextInt();	
			
			} while (resposta == 2);
			
		} else if (codigo == 2) {
			System.out.println("NECESS�RIO CONFIGURA��O PR�VIA");
			System.out.println("__________________________________________________________________");
			do { 
				System.out.println(" ");
				System.out.println("==========================================");
				System.out.println("     CONFIGURAR DA M�QUINA DE LAVAR");
				System.out.println("==========================================");
				System.out.println("Modelo: ");
				modelo = entrada.nextLine();
						
				System.out.println("Nome: ");
				nome = entrada.nextLine();
				
				System.out.println("Voltagem:");
				voltagem = entrada.nextInt();
				System.out.println("Quantos kg?");
				kg = entrada.nextInt();
				System.out.println("Dua��o est�gio 1 - Lava��o Pesada: ");
				pesada = entrada.nextInt();
				System.out.println("Dua��o est�gio 2 - Lava��o Normal: ");
				normal = entrada.nextInt();
				System.out.println("Dua��o est�gio 3 - Lava��o R�pida: ");
				rapida = entrada.nextInt();
				System.out.println("Dua��o est�gio 4 - Enxague: ");
				enxague = entrada.nextInt();
				System.out.println("Dua��o est�gio 5 - Centrifuga��o: ");
				centrifugacao = entrada.nextInt();
				
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
				
				System.out.println("Confirmar configura��o da m�quina? Digite 1 para sim/2 para n�o");
				resposta = entrada.nextInt();
				entrada.nextLine();
				
			} while (resposta == 2);
				
		} else {
			System.out.println("Sistema encerrado");
		}
		
		System.out.println("========================================");
		System.out.println("           MENU DE SIMULA��O");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a m�quina de lavar");
		System.out.println("[2] - Simular a m�quina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o c�digo:");
		codigo = entrada.nextInt();
		
			if (codigo == 1) {
				System.out.println("Sistema j� configurado! Aperte 0 (zero) para voltar ao menu inicial:");
				int voltar = entrada.nextInt();	
			} else if (codigo == 2) {
				System.out.println("=======================================================");
				System.out.println("              SIMULA��O M�QUINA DE LAVAR");
				System.out.println("=======================================================");
			
		       } else {
			System.out.println("Sistema encerrado");
		}
		
	}

}
