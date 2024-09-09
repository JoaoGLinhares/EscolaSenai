package Entidades;

public class Pessoa {

    private int matricula;
    private String cpf;
    private String nome;
    private String dataAniversario;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(int matricula, String cpf, String nome, 
                  String dataaniversario, Endereco endereco, 
                  String telefone, String email, String senha) {
                    
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.dataAniversario = dataaniversario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;

    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataaniversario() {
        return dataAniversario;
    }

    public void setDataaniversario(String dataaniversario) {
        this.dataAniversario = dataaniversario;
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
        this.senha = senha;
    }

    


}
