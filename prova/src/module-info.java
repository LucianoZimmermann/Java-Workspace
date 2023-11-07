package avaliacao;

public class Produto {

    private String nome;
    private double preco;
    private int codigo;
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Produto A", 25.50, 121212);

        produto1.setNome("Produto B");
        produto1.setPreco(25.50);
        produto1.setCodigo(121212);

        String nomeProduto1 = produto1.getNome();
        double precoProduto1 = produto1.getPreco();
        int codigoProduto1 = produto1.getCodigo();

        System.out.println("Produto 1:");
        System.out.println("Nome: " + nomeProduto1);
        System.out.println("Preco: " + precoProduto1);
        System.out.println("Código: " + codigoProduto1);

        System.out.println("Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preco: " + produto2.getPreco());
        System.out.println("Codigo: " + produto2.getCodigo());
        }


    public Produto() {
        this.nome = "Bolacha";
        this.preco = 3.5;
        this.codigo = 855;
    }

    public Produto(String nome, double preco, int codigo) {

        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}