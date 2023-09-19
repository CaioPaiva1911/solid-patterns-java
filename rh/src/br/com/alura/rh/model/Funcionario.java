package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	// Liskov Substitution Principle (LSP)
	private DadosPessoais dadosPessoais;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	public void atualizarSalario(BigDecimal novoSalario){
		this.dadosPessoais.setSalario(novoSalario);
		this.dadosPessoais.setDataUltimoReajuste(LocalDate.now());
	}


    public void promover(Cargo novoCargo) {
    	this.dadosPessoais.setCargo(novoCargo);
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
}
