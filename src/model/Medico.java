package model;

public class Medico extends Funcionario {

    private String CRM;
    private String Especialidade;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public void setFuncionario(String CRM, String Especialidade) {
        this.setCRM(CRM);
        this.setEspecialidade(Especialidade);
    }

    @Override
    public double gerarBonus() {
        return CalcSalario() * 0.3;
    }
}
