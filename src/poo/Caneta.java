public class Caneta {
    // Atributos da classe
    String marca;
    String modelo;
    String cor;
    boolean tampada;

    // Métodos da classe
    void escrever() {
        if (!this.tampada) {
            System.out.println("Você pode escrever!");
        } else {
            System.out.println("Você não pode escrever");
        }
    }

    void destampar() {
        this.tampada = false;
    }

    void tampar() {
        this.tampada = true;
    }

    void statusCaneta() {
        System.out.println("A marca da caneta é: " + this.marca);
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A caneta está tampada? " + (this.tampada ? "Sim" : "Não"));

        if (tampada) {
            System.out.println("Está tampada");
        } else {
            System.out.println("Não está tampada");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Caneta
        Caneta a = new Caneta();
        // Definindo valores para a instância
        a.marca = "Bic";
        a.modelo = "Cristal";
        a.cor = "Azul";
        a.tampada = false;

        // Verificando o status da caneta
        a.statusCaneta();
        a.destampar();
        a.escrever();
    }
}
