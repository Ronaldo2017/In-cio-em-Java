package cursojava.executavel;

import java.sql.Date;

public class Pessoa {

	private String nome;
	private String sobreNome;

	private int idade;

	private Date dataNasc;

	private String cpf;

	/*
	 * para voltar para o codigo anterior clica na classe: vai em Replace With:
	 * clica em Head Revision volta versão que esta no servidor
	 * 
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
