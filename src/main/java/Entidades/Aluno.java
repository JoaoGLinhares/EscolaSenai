package Entidades;

import java.util.Date;

public class Aluno extends Pessoa {

    private Date dataDeMatricula;
    private String curso;
    private Situacao situacao;

    public Aluno(int matricula, String cpf, String nome, 
                 Date dataAniversario, Endereco endereco, 
                 String telefone, String email, String senha, 
                 Date dataDeMatricula, String curso, Situacao situacao) {

        super(matricula, cpf, nome, dataAniversario, endereco, telefone, email, senha);
        this.dataDeMatricula = dataDeMatricula;
        this.curso = curso;
        this.situacao = situacao;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataDeMatricula=" + dataDeMatricula +
                ", curso='" + curso + '\'' +
                ", situacao=" + situacao.getStts() +
                '}';
    }
}
