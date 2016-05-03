package Aula02052016;

import java.sql.Date;
import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private int idade;
	private Date primeiraCompra;
	private boolean ativo;
	
	
	
	public Cliente(String nome, int idade, boolean ativo, Date primeiraCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ativo = ativo;
		this.primeiraCompra = primeiraCompra;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Date getPrimeiraCompra() {
		return primeiraCompra;
	}

	public void setPrimeiraCompra(Date primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade
				+ ", primeiraCompra=" + primeiraCompra + ", ativo=" + ativo
				+ "]";
	}
}
