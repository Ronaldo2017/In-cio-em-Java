package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/*
	 * variavel global acessivel a todos
	 * 
	 * static para ter acesso
	 */

	static int maiorIdadeGlobal = 30;

	/* classe main = principal para execução do projeto */
	public static void main(String[] args) {

		/* variavel local acessivel ao metodo */
		/*
		 * double n1 = 90; double n2 = 95; double n3 = 79; double n4 = 75;
		 * 
		 * System.out.println("Média = " + (n1 + n2 + n3 + n4) / 4);
		 * 
		 * char letra = 'F';
		 * 
		 * System.out.println("Letra: " + letra);
		 * 
		 * //concatenacao String nome = "Ronaldo"; String cpf = "552.658.965-68"; String
		 * telefone = "45 6889-8954"; String endereco = "Rua de teste";
		 * 
		 * System.out.println("Nome: " + nome + "Cpf:" + cpf + "Contato: " +
		 * "Endereço: " + endereco);
		 */

		// operador ternario
		/*double n1 = 90;
		double n2 = 95;
		double n3 = 79;
		double n4 = 75;
		double media = 0;

		media = (n1 + n2 + n3 + n4) / 4;*/

		/*
		 * String saidaResultado;
		 * 
		 * saidaResultado = media >= 70 ? "Aprovado: " + media : "Reprovado";
		 * 
		 * System.out.println(saidaResultado);
		 */

		// switch
		/*
		 * int dia = 11; switch (dia) { case 1: System.out.println("Domingo"); break;
		 * 
		 * default: System.out.println("Outro dia"); break; }
		 */

		// while
		/*
		 * int num = 0; while(num <= 10) { System.out.println("Numero atual: " + num);
		 * num++; }
		 */

		/*
		 * for (int num = 0; num <= 10; num++) { if (num == 3) {
		 * System.out.println("Encontrei o: " + num); break; }
		 * 
		 * }
		 */

		// entrada de dados
	/*	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoa);

		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisao?");

		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,
					"Divissao para cada pessao " + divisao + " carros" + "e sobrou " + resto + " carros");
		}*/
		
		String n1 = JOptionPane.showInputDialog("Informe a nota 1");
		String n2 = JOptionPane.showInputDialog("Informe a nota 2");
		String n3 = JOptionPane.showInputDialog("Informe a nota 3");
		String n4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		double dN1 = Double.parseDouble(n1);
		double dN2 = Double.parseDouble(n2);
		double dN3 = Double.parseDouble(n3);
		double dN4 = Double.parseDouble(n4);
		
		double media = (dN1 + dN2 + dN3 + dN4) / 4;
		
		if(media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com media de: " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com media de: " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com media de: " + media);
		}

	}

}
