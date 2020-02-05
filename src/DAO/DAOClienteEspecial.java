package DAO;

import Banco.Banco;
import Model.ModelClienteEspecial;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class DAOClienteEspecial implements DAO<ModelClienteEspecial>{
    
    //Variaveis auxiliares
    private ModelClienteEspecial cli; //model para dados
    //recebera comandos DML
    private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    public ModelClienteEspecial buscar(ModelClienteEspecial obj) 
            throws SQLException, ClassNotFoundException {  
        cli = null;
            String sql;
        //crirar o DML
        sql = "SELECT * FROM tbClienteEspecial "
            + "WHERE cpf = ?";
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getCpf());
        
        rs = pst.executeQuery();
        
        if(rs.next()) {
            cli = new ModelClienteEspecial();
            cli.setCpf(rs.getString("cpf"));
            cli.setNome(rs.getString("nome"));
            cli.setRg(rs.getString("rg"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setDataNac(rs.getString("dataNascimento"));
            cli.setEmail(rs.getString("email"));   
        }

        rs.close();
        Banco.fechar();
        return cli;        
    }
    

    @Override
    public boolean inserir(ModelClienteEspecial obj) 
            throws SQLException, ClassNotFoundException {
 
       //To change body of generated methods, choose Tools | Templates.
       String sql;
       
       sql = "INSERT INTO tbClienteEspecial "
           + "(cpf, nome, rg, telefone, dataNascimento, email)"
           + "values (?, ? , ? , ?, ?, ?)";
       Banco.abrir();
       
       pst = Banco.getConexao().prepareStatement(sql);
       
       pst.setString(1, obj.getCpf());
       pst.setString(2, obj.getNome());
       pst.setString(3, obj.getRg());
       pst.setString(4, obj.getTelefone());
       pst.setString(5, obj.getDataNac());
       pst.setString(6, obj.getEmail());
       
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
    public boolean alterar(ModelClienteEspecial obj) 
            throws SQLException, ClassNotFoundException {
       String sql;
       
       sql = "UPDATE tbClienteEspecial SET "
           + "nome = ?, rg = ?, telefone = ?, dataNascimento = ?, email = ? "
           + "WHERE cpf = ?;";
       Banco.abrir();
       
       pst = Banco.getConexao().prepareStatement(sql);
       
       
       pst.setString(1, obj.getNome());
       pst.setString(2, obj.getRg());
       pst.setString(3, obj.getTelefone());
       pst.setString(4, obj.getDataNac());
       pst.setString(5, obj.getEmail());
       pst.setString(6, obj.getCpf());
       
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
    public boolean excluir(ModelClienteEspecial obj) 
            throws SQLException, ClassNotFoundException {
     String sql;
        //cria o comando DML
        sql = "DELETE FROM tbClienteEspecial "
            + "WHERE cpf = ?;";
        Banco.abrir();
        //Cria o pst com base na conexao e no comando DML
        pst = Banco.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        pst.setString(1, obj.getCpf());
        
        //vamos executar o comando
        if(pst.executeUpdate() > 0)
            return true;
        else 
            return false;
    }

   

    @Override
    public List<ModelClienteEspecial> listar(String criterio) 
            throws SQLException, ClassNotFoundException {
        
        List<ModelClienteEspecial> clientes = new Vector<>();
        cli = null;
        String sql = "SELECT * FROM tbclienteespecial ";
        if(criterio.length() > 0)
            sql += "WHERE " + criterio;
        Banco.abrir();
        
        pst = Banco.getConexao().prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()){
            cli = new ModelClienteEspecial();
            cli.setCpf(rs.getString("cpf"));
            cli.setNome(rs.getString("nome")); 
            
            clientes.add(cli);
        }
        rs.close();
        //devolve a colecao
        Banco.fechar();
        return clientes; 
       
    }
}
