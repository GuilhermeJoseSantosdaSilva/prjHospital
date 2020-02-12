
package prjhospital;

public class Funcionario extends Pessoa {
    private int Matricula;
    private String Senha;

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
}
