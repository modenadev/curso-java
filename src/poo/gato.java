public class gato {
    String nome;
    String cor;
    String sexo;
    boolean brincando;

    void dormindo() {
        System.out.println("O gato está dormindo");
    }

    void comendo() {
        System.out.println("Ele está comendo");
    }

    void status() {
        System.out.println("O nome do gato é " + this.nome);
    }

    void brincar() {
        if (this.brincando) {
            System.out.println("Está brincando");
        } else {
            System.out.println("Não está brincando");
        }
    }

    void eBrincando() {
        this.brincando = true;
    }

    void eNaoBrincando() {
        this.brincando = false;
    }

    public static void main(String[] args) {
        gato g = new gato();
        g.nome = "shitara";
        g.status();
        g.eBrincando();
        g.brincar();
    }
}
