import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    // Atributos
    private Cliente cliente;
    private List<Livro> livrosPedido;
    private Date dataPedido;
    private double valorTotal;

    // Construtor
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.livrosPedido = new ArrayList<>();
        this.dataPedido = new Date(); // A data atual como padrão
        this.valorTotal = 0.0;
    }

    // Métodos para manipulação da lista de livros no pedido
    public void adicionarLivro(Livro livro) {
        livrosPedido.add(livro);
        valorTotal += calcularPrecoLivro(livro);
    }

    public void removerLivro(Livro livro) {
        livrosPedido.remove(livro);
        valorTotal -= calcularPrecoLivro(livro);
    }

    // Método auxiliar para calcular o preço de um livro (pode ser expandido conforme necessário)
    private double calcularPrecoLivro(Livro livro) {
        // Lógica para calcular o preço do livro (exemplo: preço fixo por livro)
        return 10.0;
    }

    // Métodos de acesso (getters e setters)
    public Cliente getCliente() {
        return cliente;
    }

    public List<Livro> getLivrosPedido() {
        return livrosPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Método toString para representação em string do objeto
    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", livrosPedido=" + livrosPedido +
                ", dataPedido=" + dataPedido +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
