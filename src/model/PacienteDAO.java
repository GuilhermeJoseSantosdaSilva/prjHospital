package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Guilherme José
 */
public class PacienteDAO {
    private int id_Hospital;

    public int getId_Hospital() {
        return id_Hospital;
    }

    public void setId_Hospital(int id_Hospital) {
        this.id_Hospital = id_Hospital;
    }
    
    private Connection con = new ConnectionFactory().getConnection();
    
    public void cadastrar(Paciente paciente){
        try{
            String query = "insert into paciente (nome, cpf, rg, idade, senha, id_hospital) values (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, paciente.getNome());
            preparedStmt.setString(2, paciente.getCpf());
            preparedStmt.setString(3, paciente.getRg());
            preparedStmt.setInt(4, paciente.getIdade());
            preparedStmt.setString(5, PacienteDAO.getId_Hospital());
            
            preparedStmt.execute();
            
            con.close();
            
        } catch(Exception e){
        
        }
    }
    
    public ArrayList<Paciente> buscar(){
        ArrayList<Paciente> ap = new ArrayList();
        try{
            String query = "Select * from paciente";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(query);
            
            while(rs.next()){
            Paciente p = new Paciente(rs.getString("nome"));
            p.setSenha(rs.getString("senha"));
            p.setCpf(rs.getString("cpf"));
            p.setIdade(rs.getInt("idade"));
            p.setRg(rs.getString("rg"));
            }
        } catch(Exception e ){
        
        }
        return ap;
    }
}
