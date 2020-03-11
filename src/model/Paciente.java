package model;

import model.Pessoa;

public class Paciente extends Pessoa {

    private int codPaciente;
    private String senha;

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Paciente(String nome) {
        this.setNome(nome);
    }
}
