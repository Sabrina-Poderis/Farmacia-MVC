package DAO;

import Banco.Banco;
import Model.ModelCaixa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DAOCaixa implements DAO<ModelCaixa>{
    private ModelCaixa numCaixa;
    private java.sql.PreparedStatement pst; 
    private java.sql.ResultSet rs;

        

    @Override
    public boolean inserir(ModelCaixa obj) throws SQLException, ClassNotFoundException {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   

    @Override
    public ModelCaixa buscar(ModelCaixa obj) throws SQLException, ClassNotFoundException {
        
        List<ModelCaixa> caixas = new ArrayList<>();
        
        String sql = "SELECT * FROM tbCaixa "
                   + "WHERE numCaixa = ?";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);        
        pst.setInt(1, obj.getNumCaixa2());
        
        rs = pst.executeQuery();
       
        if(rs.next()) {            
            numCaixa = new ModelCaixa();
            numCaixa.setNumCaixa2(rs.getInt("numCaixa"));
            numCaixa.setValorAtualCaixa(rs.getDouble("valorAtualCaixa"));
            caixas.add(numCaixa);
        }
       
        rs.close();
        Banco.fechar();
        return (ModelCaixa) caixas;
    }
        
    @Override
    public boolean alterar(ModelCaixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(ModelCaixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModelCaixa> listar(String criterio) throws SQLException, ClassNotFoundException {
        List<ModelCaixa> caixas = new Vector<>();
        
        
        
        String sql = "SELECT * FROM tbCaixa";
        
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
      
        rs = pst.executeQuery();
      
        while(rs.next()) { 
            numCaixa = new ModelCaixa();
            numCaixa.setNumCaixa2(rs.getInt("numCaixa"));
            numCaixa.setValorAtualCaixa(rs.getDouble("valorCaixaAtual"));

            caixas.add(numCaixa);
        } 

        rs.close();       
        Banco.fechar();
        return caixas;    
    }

   
}
