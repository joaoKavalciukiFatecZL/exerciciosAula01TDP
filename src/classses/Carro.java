package classses;

public class Carro {
    private String modelo;
    private String montadora;
    private String cor;
    private double kilometragem;
    private double preco;
    private int ano;
    
    public Carro(String modelo, String montadora, String cor, double kilometragem, double preco, int ano){
        this.modelo = modelo;
        this.montadora = montadora;
        this.cor = cor;
        this.kilometragem = kilometragem;
        this.preco = preco;
        this.ano = ano;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMontadora(){
        return this.montadora;
    }

    public void setMontadora(String montadora){
        this.montadora = montadora;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getKilometragem(){
        return this.kilometragem;
    }

    public  void setKilometragem(double kilometragem){
        this.kilometragem = kilometragem;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "Características do " + getModelo() + ":"
        + "\nMontadora: " + getMontadora()
        + "\nAno: " + getAno()
        + "\nCor: " + getCor()
        + "\nKilometragem: " + String.format("%.3f", getKilometragem()) + " KM"
        + "\nPreço: R$" + String.format("%.3f", getPreco());
    }
}
