package br.com.alura.rh.model;

public class Terceirizado {

    DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(String nome, String cpf, Cargo cargo, String empresa) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo);
        this.empresa =  empresa;
    }
}
