// Construtor
    public EventoCompraLivros() {
        this.livrosComprados = new ArrayList<>();
        this.dataCompra = new Date(); // A data atual como padrão
        this.valorTotal = 0.0;
    }

    // Métodos para manipulação da lista de livros
    public void adicionarLivro(Livro livro) {
        livrosComprados.add(livro);
        valorTotal += calcularPrecoLivro(livro);
    }

    public void removerLivro(Livro livro) {
        livrosComprados.remove(livro);
        valorTotal -= calcularPrecoLivro(livro);
    }

    // Método auxiliar para calcular o preço de um livro (pode ser expandido conforme necessário)
    private double calcularPrecoLivro(Livro livro) {
        // Lógica para calcular o preço do livro (exemplo: preço fixo por livro)
        return 10.0;
    }

    // Métodos de acesso (getters e setters)
    public List<Livro> getLivrosComprados() {
        return livrosComprados;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
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
        return "EventoCompraLivros{" +
                "livrosComprados=" + livrosComprados +
                ", dataCompra=" + dataCompra +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
