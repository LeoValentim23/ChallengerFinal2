package Challenger.com.br.model;

public class Cliente {
    private String nome;
    private static String carro;
    private static String placa;
    private String pesoVeiculo;
    private String cpf;

    private String senha;

    public Cliente(String nome, String carro, String placa, String pesoVeiculo, String cpf , String senha) {
        this.nome = nome;
        this.carro = carro;
        this.placa = placa;
        this.pesoVeiculo = pesoVeiculo;
        this.cpf = cpf;
        this.senha=senha;
    }

    public String getNome() {
        return nome;
    }

    public static String getCarro() {
        return carro;
    }

    public static String getPlaca() {
        return placa;
    }

    public String getPesoVeiculo() {
        return pesoVeiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }
}
