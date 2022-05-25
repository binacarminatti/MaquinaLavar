/**
 * 
 */
package MaquinaLavar;

import java.util.Scanner;

/**
 * @author Pichau
 *
 */
public class MaquinaLavar {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		String modelo = "", nome = "";
		int voltagem = 0, kg = 0, pesada = 0, normal = 0, rapida = 0, enxague = 0, centrifugacao = 0, resposta, resposta2, codigo;
		
		
		do {
		System.out.println("========================================");
		System.out.println("           MENU DE SIMULAÇÃO");
		System.out.println("========================================");
		System.out.println("[1] - Configurar a máquina de lavar");
		System.out.println("[2] - Simular a máquina de lavar");
		System.out.println("[0] - Sair");
		System.out.println("Digite o código:");
		codigo = entrada.nextInt();
		
		
		switch (codigo) {
			case 1: 
				do {
				System.out.println("==========================================");
				System.out.println("     CONFIGURAR DA MÁQUINA DE LAVAR");
				System.out.println("==========================================");
				entrada.nextLine();	
				System.out.println("Modelo: ");
				modelo = entrada.nextLine();
				System.out.println("Voltagem:");
				voltagem = entrada.nextInt();
				entrada.nextLine();	
				System.out.println("Nome: ");
				nome = entrada.nextLine();
				System.out.println("Quantos kg?");
				kg = entrada.nextInt();
				System.out.println("Duação estágio 1 - Lavação Pesada: ");
				pesada = entrada.nextInt();
				System.out.println("Duação estágio 2 - Lavação Normal: ");
				normal = entrada.nextInt();
				System.out.println("Duação estágio 3 - Lavação Rápida: ");
				rapida = entrada.nextInt();
				System.out.println("Duação estágio 4 - Enxague: ");
				enxague = entrada.nextInt();
				System.out.println("Duação estágio 5 - Centrifugação: ");
				centrifugacao = entrada.nextInt();
				
				System.out.println("==========================================");
				System.out.println("          CONFIRMAR CONFIGURAÇÃO ");
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
				break;
				
			case 2:
				System.out.println("Você já configurou a máquina? Digite 1 para SIM ou 2 para NÃO: ");
				resposta2 = entrada.nextInt();
				if (resposta2 == 1) {
					System.out.println("=======================================================");
					System.out.println("              SIMULAÇÃO MÁQUINA DE LAVAR");
					System.out.println("=======================================================");
					System.out.println("   ");
					System.out.println("Simulando máquina Modelo: " + modelo + " - " + nome + " - " + kg + " - " + "Voltagem: " + voltagem);
					System.out.println("  ");
					System.out.println("=========================================================================================");
					System.out.println("QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR?");
					System.out.println("\n"
				                + "1 - Lavagem Pesada\n"
				                + "2 - Lavagem Normal\n"
				                + "3 - Lavagem Rápida\n"
				                + "4 - Enxague\n"
				                + "5 - Centrifugação");
					System.out.println("Selecione o estágio inicial: ");
					int inicial = entrada.nextInt();
					
					float porcentagem = 0;
			        float score = 0;
			     				       
					switch (inicial) {
					
					case 1: 
						 
				        while (porcentagem < 100) {
				        	porcentagem = (score*50)/pesada;
				        	System.out.println("Estágio 1 - Em lavação pesada: " + porcentagem + "%");
				        	Thread.sleep(500);
				        	score++;
				        }
				        porcentagem = 0;
						score = 0;
						System.out.println("  ");
						
								
					case 2: 
						while (porcentagem < 100) {
							porcentagem = (score*50)/normal;
							System.out.println("Estágio 2 - Em lavação normal: " + porcentagem + "%");
							Thread.sleep(500);
							score++;
						  }
						porcentagem = 0;
						score = 0;
						System.out.println("  ");
						  
					case 3: 
								     				     
				        while (porcentagem < 100) {
				        	porcentagem = (score*50)/rapida;
				        	System.out.println("Estágio 3 - Em lavação rápida: " + porcentagem + "%");
				        	Thread.sleep(500);
				        	score++;
						}
				        porcentagem = 0;
						score = 0;
						System.out.println("  ");
				        
					case 4: 
						while (porcentagem < 100) {
							porcentagem = (score*50)/enxague;
							System.out.println("Estágio 4 - Em enxágue: " + porcentagem + "%");
							Thread.sleep(500);
							score++;
						}
						porcentagem = 0;
						score = 0;
						System.out.println("  ");
												
					case 5: 
						 while (porcentagem < 100) {
						 porcentagem = (score*50)/centrifugacao;
						System.out.println("Estágio 5 - Em centrifugação: " + porcentagem + "%");
						Thread.sleep(500);
						score++;
						}
						break;
				                 
				    default:
				    	System.out.println("Escolha uma opção existente no menu: ");
				    	break;
					}
				} else {
					System.out.println("Você deve configurar primeiro");
				}
				break;
			
			case 0:
				System.out.println("Sistema encerrado!");
				break;
			
			default:
				System.out.println("Escolha uma das opções existentes");
				break;
		}
		
	} while (codigo != 0);

		}
	}

