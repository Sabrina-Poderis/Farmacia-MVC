package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelGerenciamentoCaixa {    
    private String status, numCaixa;    
    private Date data;
    
    public String getDataHora() { 	
        DateFormat dateFormat = new SimpleDateFormat("HH:mm dd-MM-yyyy");
	data = new Date(); 
	return dateFormat.format(data); 
    }           

    public String getNumCaixa() {
        return numCaixa;
    }

    public void setNumCaixa(String numCaixa) {
        this.numCaixa = numCaixa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
}