import classses.CaixaDeDialogo;
import classses.Carro;
import classses.Eletrodomestico;

public class App {
    public static void main(String[] args) throws Exception {
        Carro jetta = new Carro("Jetta", "Volkswagen", "Roxo escuro", 0.00, 193.750, 2022);
        Eletrodomestico notebook = new Eletrodomestico("Matebook X Pro", "Huawei", 10386.00, 2.00);
        CaixaDeDialogo caixa = new CaixaDeDialogo("Retangular", "Exercício de POO da matéria de Técnicas de Programação I");
        System.out.println(jetta);
        System.out.println();
        System.out.println(notebook);
        System.out.println();
        System.out.println(caixa);

    }
}
