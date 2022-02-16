package classses;

public class CaixaDeDialogo {
    private String formato, texto;

    public CaixaDeDialogo(String formato, String texto){
        this.formato = formato;
        this.texto = texto;
    }

    public String getFormato(){
        return this.formato;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }

    public String getTexto(){
        return this.texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    @Override
    public String toString(){
        return "Caixa de dialogo " + " com formato de " + getFormato() + "\n"
        + "Texto: "  + getTexto();
    }
}
