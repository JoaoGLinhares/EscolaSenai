package Entidades;

import java.util.Date;

public class Professor extends Pessoa {

    private Date dataAdmissao;
    private double salario;

    public Professor(int matricula, String cpf, String nome, 
                     Date dataAniversario, Endereco endereco, 
                     String telefone, String email, String senha, 
                     Date dataAdmissao, double salario) {
                        
        super(matricula, cpf, nome, dataAniversario, endereco, telefone, email, senha); 
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
