package prjhospital;

import java.util.ArrayList;

public class Hospital {

   private String endereco;
   private int IdHospital;
   private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdHospital() {
        return IdHospital;
    }

    public void setIdHospital(int IdHospital) {
        this.IdHospital = IdHospital;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void listarTodosFuncionarios(){
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i));
        }
    }
    
    public Hospital(int id, String endereco){
    this.IdHospital = id;
    this.endereco = endereco;
    }
}
