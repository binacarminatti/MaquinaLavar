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
		System.out.println("           MENU DE SIMULAÇÃO");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a máquina de lavar");
		System.out.println("[2] - Simular a máquina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o código:");
		
		int codigo = entrada.nextInt();
		int resposta;
				
		if (codigo == 1) {
			do {
			System.out.println("==========================================");
			System.out.println("     CONFIGURAR DA MÁQUINA DE LAVAR");
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
			System.out.println("Duação estágio 1 - Lavação Pesada: ");
			int pesada = entrada.nextInt();
			System.out.println("Duação estágio 2 - Lavação Normal: ");
			int normal = entrada.nextInt();
			System.out.println("Duação estágio 3 - Lavação Rápida: ");
			int rapida = entrada.nextInt();
			System.out.println("Duação estágio 4 - Enxague: ");
			int enxague = entrada.nextInt();
			System.out.println("Duação estágio 5 - Centrifugação: ");
			int centrifugacao = entrada.nextInt();
			
			System.out.println("==========================================");
			System.out.println("     CONFIGURAÇÃO DA MÁQUINA DE LAVAR");
			System.out.println("==========================================");
			
			System.out.println("Modelo: " + modelo);
			System.out.println("Nome: " + nome);
			System.out.println("Voltagem: " + voltagem);
			System.out.println("Quantos kg: " + kg);
			System.out.println("Duação estágio 1 - Lavação Pesada: " + pesada);
			System.out.println("Duação estágio 2 - Lavação Normal: " + normal);
			System.out.println("Duação estágio 3 - Lavação Rápida: " + rapida);
			System.out.println("Duação estágio 4 - Enxague: " + enxague);
			System.out.println("Duação estágio 5 - Centrifugação: " + centrifugacao);
			
			System.out.println("Confirmar configuração da máquina? Digite 1 para sim/2 para não");
			resposta = entrada.nextInt();	
			
			} while (resposta == 2);
			
		} else if (codigo == 2) {
			System.out.println("NECESSÁRIO CONFIGURAÇÃO PRÉVIA");
			System.out.println("__________________________________________________________________");
			
				System.out.println(" ");
				System.out.println("==========================================");
				System.out.println("     CONFIGURAR DA MÁQUINA DE LAVAR");
				System.out.println("==========================================");
				System.out.println("Modelo: ");
				String modelo = entrada.nextLine();
						
				System.out.println("Nome: ");
				String nome = entrada.nextLine();
				
				System.out.println("Voltagem:");
				int voltagem = entrada.nextInt();
				System.out.println("Quantos kg?");
				int kg = entrada.nextInt();
				System.out.println("Duação estágio 1 - Lavação Pesada: ");
				int pesada = entrada.nextInt();
				System.out.println("Duação estágio 2 - Lavação Normal: ");
				int normal = entrada.nextInt();
				System.out.println("Duação estágio 3 - Lavação Rápida: ");
				int rapida = entrada.nextInt();
				System.out.println("Duação estágio 4 - Enxague: ");
				int enxague = entrada.nextInt();
				System.out.println("Duação estágio 5 - Centrifugação: ");
				int centrifugacao = entrada.nextInt();
				
				System.out.println("==========================================");
				System.out.println("     CONFIGURAÇÃO DA MÁQUINA DE LAVAR");
				System.out.println("==========================================");
				
				System.out.println("Modelo: " + modelo);
				System.out.println("Nome: " + nome);
				System.out.println("Voltagem: " + voltagem);
				System.out.println("Quantos kg: " + kg);
				System.out.println("Duação estágio 1 - Lavação Pesada: " + pesada);
				System.out.println("Duação estágio 2 - Lavação Normal: " + normal);
				System.out.println("Duação estágio 3 - Lavação Rápida: " + rapida);
				System.out.println("Duação estágio 4 - Enxague: " + enxague);
				System.out.println("Duação estágio 5 - Centrifugação: " + centrifugacao);
				
				System.out.println("Confirmar configuração da máquina? Digite 1 para sim/2 para não");
				resposta = entrada.nextInt();
				entrada.nextLine();
				
		} else {
			System.out.println("Sistema encerrado");
		}
		
		System.out.println("========================================");
		System.out.println("           MENU DE SIMULAÇÃO");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a máquina de lavar");
		System.out.println("[2] - Simular a máquina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o código:");
		codigo = entrada.nextInt();
		
			if (codigo == 1) {
				System.out.println("Sistema já configurado! Aperte 0 (zero) para voltar ao menu inicial:");
				int voltar = entrada.nextInt();	
			} else if (codigo == 2) {
			
		} else {
			System.out.println("Sistema encerrado");
		}
		
	}

}
