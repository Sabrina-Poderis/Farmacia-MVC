package Model;



public class Medicamento {
    private String id, nome, descricao, laboratorio;
    private int unidade;
    private double valor;
     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getId() {
        return id;
    }
    
    public int getUnidade(){
        return unidade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return getId(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
