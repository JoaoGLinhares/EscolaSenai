package Entidades;

import java.util.Date;

public abstract class Pessoa {
    public static int registroConta = 1001;

    private int matricula;
    private String cpf;
    private String nome;
    private Date dataAniversario;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(int matricula, String cpf, String nome, 
                  Date dataAniversario, Endereco endereco, 
                  String telefone, String email, String senha) {
        this.matricula = registroConta;
        registroConta++;
        this.cpf = cpf;
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {
        this.matricula = registroConta;
        registroConta++;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty() || !isValidCpf(cpf)) {
            System.out.println("Número de CPF inválido");
        } else {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isEmpty() || !isValidSenha(senha)) {
            System.out.println("Senha inválida");
        } else {
            this.senha = senha;
        }
    }

    private boolean isValidCpf(String cpf) {
        return cpf.length() == 11;
    }

    private boolean isValidSenha(String senha) {
        return senha.length() >= 8;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "matricula=" + matricula +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", dataAniversario=" + dataAniversario +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
