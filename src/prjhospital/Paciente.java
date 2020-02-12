
package prjhospital;

public class Paciente extends Pessoa{
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
    public Paciente(int codPaciente, String senha, String nome, String rg, String cpf, int idade){
        this.setCodPaciente(codPaciente);
        this.setSenha(senha);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setRg(rg);
    }    
}
