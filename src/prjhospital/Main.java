package prjhospital;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Enfermeiro;
import model.Funcionario;
import model.Hospital;
import model.Medico;
import model.Paciente;
import model.ProntoSocorro;

/**
 *
 * @author Guilherme José
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Funcionario a = new Funcionario();
        a.setFuncionario("Rodolfo", "123", "321", 24, 1, "adoadoadoquemlerasenha");
        a.setValorHora(16.5);
        System.out.println(a.CalcSalario());
        System.out.println("O bonus é de "+a.gerarBonus());
        System.out.println(a.getCpf());
        System.out.println(a.getIdade());
        System.out.println(a.getMatricula());
        System.out.println(a.getNome());
        System.out.println(a.getRg());
        System.out.println(a.getSenha());
        System.out.println("\n");
        
        Paciente b = new Paciente(4, "oiiii", "Joao", "456", "654", 18);
        System.out.println(b.getCodPaciente());
        System.out.println(b.getCpf());
        System.out.println(b.getIdade());
        System.out.println(b.getNome());
        System.out.println(b.getRg());
        System.out.println(b.getSenha());
        System.out.println("\n");
        
        Enfermeiro c = new Enfermeiro();
        c.setValorHora(18.5);
        System.out.println(c.CalcSalario(20));
        c.setFuncionario("corem", "Matheus", "789", "987", 42, 2, "estouservindoaospacientes");
        System.out.println("O bonus é de "+c.gerarBonus());
        System.out.println(c.getCOREM());
        System.out.println(c.getCpf());
        System.out.println(c.getIdade());
        System.out.println(c.getMatricula());
        System.out.println(c.getNome());
        System.out.println(c.getRg());
        System.out.println(c.getSenha());
        System.out.println("\n");
        
        Medico d = new Medico();
        d.setFuncionario("CRM", "Raio-x");
        d.setFuncionario("Bianca", "149", "941", 19, 5, "comeceibombando");
        d.setValorHora(27.3);
        System.out.println(d.CalcSalario());
        System.out.println("O bonus é de "+d.gerarBonus());
        System.out.println(d.getCRM());
        System.out.println(d.getCpf());
        System.out.println(d.getEspecialidade());
        System.out.println(d.getIdade());
        System.out.println(d.getMatricula());
        System.out.println(d.getNome());
        System.out.println(d.getRg());
        System.out.println(d.getSenha());
        
        Medico d1 = new Medico();
        d1.setFuncionario("CRM2", "Fisioterapia");
        d1.setFuncionario("Macedo", "129", "921", 40, 11, "senha");
        d1.setValorHora(29.3);
        System.out.println("\n");
        
        Hospital e = new Hospital(2, "Avenida endereço", "Hosiptal da Cura");
        System.out.println(e.getNome());
        System.out.println(e.getEndereco());
        System.out.println("Código "+e.getIdHospital());
        e.addFuncionario(d1);
        e.addFuncionario(a);
        e.addFuncionario(c);
        System.out.println("\n");
        System.out.println("Lista de funcionarios:");
        e.listarTodosFuncionarios();
        System.out.println("\n");
        System.out.println("Lista de médicos:");
        e.listarTodosMedicos();
        System.out.println("\n");
        System.out.println("Lista de enfermeiros:");
        e.listarTodosEnfermeiros();
        System.out.println("\n");
        
        ProntoSocorro f = new ProntoSocorro(e, 4, "Endereço do Hospital");
        System.out.println(f.getEndereco());
        System.out.println(f.getIdFilial());
        System.out.println(f.getMatriz().getNome()); */
        
        try{
            Connection con = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado Ao Banco!");
            con.close();
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }

}
