package classses;

public class Eletrodomestico {
    private String nome;
    private String marca;
    private double preco;
    private double peso;

    public Eletrodomestico(String nome, String marca, double preco, double peso){
        this.nome = nome; 
        this.marca = marca;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean ligar(){
        if(ligar() != true){
            System.out.println("Eletro doméstico ligado");
            return true;
        } else {
            System.out.println("Eletrodoméstico já está ligado");
            return false;
        }
    }


    public boolean desligar(){
        if(ligar() == true) {
            System.out.println("Eletro doméstico deligado");
            return true;
        } else {
            System.out.println("Eletrodoméstico já está deligado!");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Característica do(a) " + getNome() + ": \n"
        + "Marca: " + getMarca() 
        +"\n Preço: R$" + String.format("%.2f", preco)
        + "\n Peso: " + String.format("%.2f", peso) + "KG";            
    }
}
