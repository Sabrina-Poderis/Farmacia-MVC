package DAO;

import Banco.Banco;
import Model.ModelGerenciamentoCaixa;
import java.sql.SQLException;
import java.util.List;

public class DAOGerenciamentoCaixa implements DAO<ModelGerenciamentoCaixa>{
        
    //Variaveis auxiliares
    private ModelGerenciamentoCaixa statusCaix; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    public boolean gerarRelatorio() {            
        return false;    
    }       
       

    @Override
    public boolean inserir(ModelGerenciamentoCaixa obj) 
           throws SQLException, ClassNotFoundException {
      String sql;
       
       sql = "INSERT INTO tbGerenciamentoCaixa "
           + "(numCaixa, dataCaixa, status) "
           + "values (?, ?, ?)";
       Banco.abrir();
       
       pst = Banco.getConexao().prepareStatement(sql);                
            
       pst.setString(1,obj.getNumCaixa());
       pst.setString(2,obj.getDataHora());
       pst.setString(3, obj.getStatus());       
                     
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
    public ModelGerenciamentoCaixa buscar(ModelGerenciamentoCaixa obj) throws SQLException, ClassNotFoundException {
        statusCaix = null;
        String sql;
        
        sql = "SELECT status FROM tbgerenciamentocaixa "
            + "WHERE numCaixa = ? ORDER by idOperacoes DESC LIMIT 1";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);        
        pst.setString(1, obj.getStatus());
        
        rs = pst.executeQuery();
                
        if(rs.next()) {
            statusCaix = new ModelGerenciamentoCaixa();
            statusCaix.setStatus(rs.getString("status"));
        }
        
        rs.close();
        Banco.fechar();
        return statusCaix;  
    }  
        
    @Override
    public boolean alterar(ModelGerenciamentoCaixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(ModelGerenciamentoCaixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelGerenciamentoCaixa> listar(String criterio) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}