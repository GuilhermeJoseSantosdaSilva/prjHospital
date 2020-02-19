package prjhospital;

/**
 *
 * @author Aluno01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario a = new Funcionario();
        a.setFuncionario("Rodolfo", "123", "321", 24, 1, "adoadoadoquemlerasenha");
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
        c.setFuncionario("corem", "Matheus", "789", "987", 42, 2, "estouservindoaospacientes");
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
        System.out.println(d.getCRM());
        System.out.println(d.getCpf());
        System.out.println(d.getEspecialidade());
        System.out.println(d.getIdade());
        System.out.println(d.getMatricula());
        System.out.println(d.getNome());
        System.out.println(d.getRg());
        System.out.println(d.getSenha());
    }

}
