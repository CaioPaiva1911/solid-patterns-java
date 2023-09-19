package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	// Liskov Substitution Principle (LSP)
	private DadosPessoais dadosPessoais;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
		this.salario = salario;
	}

	public void atualizarSalario(BigDecimal novoSalario){
		this.salario  = novoSalario;
		this.dataUltimoReajuste  = LocalDate.now();
	}

    public void promover(Cargo novoCargo) {
    	this.dadosPessoais.setCargo(novoCargo);
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
}
