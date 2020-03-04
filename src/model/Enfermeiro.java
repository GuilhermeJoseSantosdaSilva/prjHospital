package model;

public class Enfermeiro extends Funcionario {

    private String COREM;

    public String getCOREM() {
        return COREM;
    }

    public void setCOREM(String COREM) {
        this.COREM = COREM;
    }

    public void setFuncionario(String COREM, String nome, String rg, String cpf, int idade, int matricula, String senha) {
        this.setCOREM(COREM);
        this.setMatricula(matricula);
        this.setSenha(senha);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setRg(rg);
    }

    @Override
    public double gerarBonus() {
        return CalcSalario() * 0.2;
    }
}
