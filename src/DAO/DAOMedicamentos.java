package DAO;

import Banco.Banco;
import Model.Medicamento;
import Model.ModelClienteEspecial;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class DAOMedicamentos implements DAO<Medicamento> {
    //Variaveis auxiliares
    private Medicamento med; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    @Override
    public Medicamento buscar(Medicamento obj) 
            throws SQLException, ClassNotFoundException {  
        med = null;
            String sql;
        //crirar o DML
        sql = "SELECT * FROM tbMedicamentos "
            + "WHERE ium = ?";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getId());
        
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            med = new Medicamento();
            med.setId(rs.getString("ium"));
            med.setNome(rs.getString("nomeComercial"));
            med.setLaboratorio(rs.getString("laboratorio"));
            med.setValor(rs.getDouble("valor"));
            med.setUnidade(rs.getInt("unidade"));
            med.setDescricao(rs.getString("descricao"));    
        }
        rs.close();
        Banco.fechar();
        return med;        
    }
    

    @Override
    public boolean inserir(Medicamento obj) 
            throws SQLException, ClassNotFoundException {
    String sql;
    
    sql = "INSERT INTO tbMedicamentos "
        + "(ium, nomeComercial, laboratorio, valor, unidade, descricao) "
        + "values (?, ?, ?, ?, ?, ?)";
    Banco.abrir();
    
    pst = Banco.getConexao().prepareStatement(sql);
    pst.setString(1, obj.getId());
    pst.setString(2, obj.getNome());
    pst.setString(3, obj.getLaboratorio());
    pst.setDouble(4, obj.getValor());
    pst.setInt(5, obj.getUnidade());
    pst.setString(6, obj.getDescricao());
    
    //vamos executar o comando
        if(pst.executeUpdate() > 0) {
            Banco.fechar();
            return true;
        }
        else {
            Banco.fechar();
            return false;
        }
     
    
    }

   
    
    @Override
    public boolean alterar(Medicamento obj) 
            throws SQLException, ClassNotFoundException {
        
    String sql;
    
    sql = "UPDATE tbMedicamentos SET "
        + "nomeComercial = ?, laboratorio = ?, valor = ?, unidade = ?, descricao = ? "
        + "WHERE ium = ?;";
    Banco.abrir();
    
    pst = Banco.getConexao().prepareStatement(sql);
 
    pst.setString(1, obj.getNome());
    pst.setString(2, obj.getLaboratorio());
    pst.setDouble(3, obj.getValor());
    pst.setInt(4, obj.getUnidade());
    pst.setString(5, obj.getDescricao());
    pst.setString(6, obj.getId());
    
    //vamos executar o comando
        if(pst.executeUpdate() > 0) {
            Banco.fechar();
            return true;
        }
        else {
            Banco.fechar();
            return false;
        } 
    }

    @Override
    public boolean excluir(Medicamento obj) 
            throws SQLException, ClassNotFoundException {
        String sql;
        //cria o comando DML
        sql = "DELETE FROM tbMedicamentos "
            + "WHERE ium = ?;";
        Banco.abrir();
        //Cria o pst com base na conexao e no comando DML
        pst = Banco.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        pst.setString(1, obj.getId());
        
        //vamos executar o comando
        if(pst.executeUpdate() > 0)
            return true;
        else 
            return false;
        
    }

    @Override
    public List<Medicamento> listar(String criterio) 
            throws SQLException, ClassNotFoundException {
    List<Medicamento> medicamentos = new Vector<>();
        med = null;
        String sql = "SELECT * FROM tbmedicamentos ";
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        Banco.abrir();
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            med = new Medicamento();
            med.setId(rs.getString("ium"));
            med.setNome(rs.getString("nomeComercial")); 
            
            medicamentos.add(med);
        }
        rs.close();
        //devolve a colecao
        Banco.fechar();
        return medicamentos;   
    }
    
}
