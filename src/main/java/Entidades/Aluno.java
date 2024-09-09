package Entidades;

import java.util.Date;

public class Aluno extends Pessoa {

    private Date dataDeMatricula;
    private String curso;
    private double nota;

    public Aluno(int matricula, String cpf, String nome, 
                 Date dataAniversario, Endereco endereco, 
                 String telefone, String email, String senha, 
                 Date dataDeMatricula, String curso, double nota) {

        super(matricula, cpf, nome, dataAniversario, endereco, telefone, email, senha);
        this.dataDeMatricula = dataDeMatricula;
        this.curso = curso;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
