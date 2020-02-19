
package prjhospital;

public class Funcionario extends Pessoa {
    private int Matricula;
    private String Senha;
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    public void setFuncionario(String nome, String rg, String cpf, int idade, int matricula, String senha){
        this.Matricula = matricula;
        this.Senha = senha;
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setRg(rg);
    }
    
    public double CalcSalario(){
    return valorHora * 30;
    }
    
    public double CalcSalario(double descontos){
        return (valorHora * 30) - descontos;
    }
    
    public double gerarBonus(){
    return CalcSalario() * 0.1;
    }
}
