package clases;



public class Empresas {
    private String tipDoc;
    private String documento;
    private String representante;

    public String getTipDoc() {
        return tipDoc;
    }

    public String setTipDoc(String tipDoc) {
        return this.tipDoc = tipDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public String SetDocumento1(String documento) {
    	return  this.documento = documento;
    }
    

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}
