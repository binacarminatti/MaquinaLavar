/**
 * 
 */
package MaquinaLavar;

import java.time.Duration;
import java.util.Scanner;

/**
 * @author Pichau
 *
 */
public class MaquinaLavar {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		String modelo = "", nome = "";
		int voltagem = 0, kg = 0, pesada = 0, normal = 0, rapida = 0, enxague = 0, centrifugacao = 0, resposta, resposta2, codigo;
		
		
		do {
		System.out.println("========================================");
		System.out.println("           MENU DE SIMULA��O");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a m�quina de lavar");
		System.out.println("[2] - Simular a m�quina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o c�digo:");
		codigo = entrada.nextInt();
		
		
		switch (codigo) {
			case 1: 
				do {
				System.out.println("==========================================");
				System.out.println("     CONFIGURAR DA M�QUINA DE LAVAR");
				System.out.println("==========================================");
				System.out.println("Modelo: ");
				modelo = entrada.nextLine();
				entrada.nextLine();	
				System.out.println("Voltagem:");
				voltagem = entrada.nextInt();
				System.out.println("Nome: ");
				nome = entrada.nextLine();
				entrada.nextLine();	
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
				break;
				
			case 2:
				System.out.println("Voc� j� configurou a m�quina? Digite 1 para SIM ou 2 para N�O: ");
				resposta2 = entrada.nextInt();
				if (resposta2 == 1) {
					System.out.println("=======================================================");
					System.out.println("              SIMULA��O M�QUINA DE LAVAR");
					System.out.println("=======================================================");
					System.out.println("   ");
					System.out.println("Simulando m�quina Modelo: " + modelo + " - " + nome + " - " + kg + " - " + "Voltagem: " + voltagem);
					System.out.println("QUAL EST�GIO VOC� DESEJA COME�AR?");
					System.out.println("\n"
				                + "1 - Lavagem Pesada\n"
				                + "2 - Lavagem Normal\n"
				                + "3 - Lavagem R�pida\n"
				                + "4 - Enxague\n"
				                + "5 - Centrifuga��o");
					System.out.println("Selecione o est�gio inicial: ");
					int inicial = entrada.nextInt();
					
					if (inicial == 1) {
				        float porcentagem = 0;
				        float score = 0;
				     				        
				        while (porcentagem < 100) {
				        	porcentagem = (score*50)/pesada;
				        	System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
				        	Thread.sleep(500);
				        	score++;
				        }
				        if (inicial == 2) {
				        	 
						        while (porcentagem < 100) {
						        	porcentagem = (score*50)/normal;
						        	System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
						        	Thread.sleep(500);
						        	score++;
						        }
						        if (inicial == 3) {
		        	 		        
							        while (porcentagem < 100) {
							        	porcentagem = (score*50)/rapida;
							        	System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
							        	Thread.sleep(500);
							        	score++;
							        }
							        if (inicial == 4) {
			        	 		        
								        while (porcentagem < 100) {
								        	porcentagem = (score*50)/enxague;
								        	System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
								        	Thread.sleep(500);
								        	score++;
								        }
								        if (inicial == 5) {
				        	 		        
									        while (porcentagem < 100) {
									        	porcentagem = (score*50)/centrifugacao;
									        	System.out.println("Est�gio 1 - Em lava��o pesada: " + porcentagem + "%");
									        	Thread.sleep(500);
									        	score++;
									        }
				        
						               }
				                   } 
				        
					             }
				        }
				}
				} else {
				System.out.println("Configure a m�quina primeiro");
				}
				break;
			
			case 0:
				System.out.println("Sistema encerrado!");
				break;
			
			default:
				System.out.println("Escolha uma das op��es existentes");
				break;
			
		}
		

	} while (codigo != 0);

	}
}
