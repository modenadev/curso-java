
public static class Livro {
    String titulo;
    String Editora;
    int edicao;
    int ano;
    String autor;
    String tipoCapa;
    int QtdeFolhas;
    String ISBN;
    String idioma;
    boolean aberto;

    void estudar() {
        if (!this.aberto) {
            System.out.println("Você não pode estudar, o livro está fechado");
        } else {
            System.out.println("Bons estudos!");
        }
    }

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }

    void anotar() {
        if (!this.aberto) {
            System.out.println("Você precisa abrir antes de anotar");
        } else {
            System.out.println("Anotando...");
        }
    }

    void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Editora: " + this.Editora);
        System.out.println("Edição: " + this.edicao);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tipo de Capa: " + this.tipoCapa);
        System.out.println("Quantidade de folhas: " + this.QtdeFolhas);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Idioma: " + this.idioma);
        if (aberto) {
            System.out.println("O livro está aberto");
        } else {
            System.out.println("O livro está fechado");
        }

    }

}


public static void main(String[] args) {
    Livro l = new Livro();
    l.titulo = "Use a Cabeça! Java";
    l.Editora = "Alta Books";
    l.edicao = 2;
    l.ano = 2007;
    l.autor = "Kathy Sierra";
    l.tipoCapa = "Brochura";
    l.QtdeFolhas = 796;
    l.ISBN = "9788576081739";
    l.idioma = "Português";

    l.fechar();
    l.estudar();
    System.out.println("***********STATUS*******");
    l.status();
    System.out.println("**************************");
}