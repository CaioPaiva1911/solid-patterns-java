package br.com.alura.rh.model;

public class DadosPessoais {
    private String nome;
    private String cpf;
    private Cargo cargo;


    public DadosPessoais(String nome, String cpf, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
