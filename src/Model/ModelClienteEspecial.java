
package Model;

public class ModelClienteEspecial {
    
    public ModelClienteEspecial(){
    }
    
    
    
    private String rg, email, nome, dataNac, cpf, telefone;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNac() {
        return dataNac;
    }

    public void setDataNac(String dataNac) {
        this.dataNac = dataNac;
    }

    @Override
    public String toString() {
        return getCpf(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
