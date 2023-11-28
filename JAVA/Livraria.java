 public static class Livraria {
        public Livro[] livros;
        public Cliente[] clientes;
        public Pedido[] pedidos;
        public int numLivros;
        public int numClientes;
        public int numPedidos;

        public Livraria(int capacidadeLivros, int capacidadeClientes, int capacidadePedidos) {
            livros = new Livro[capacidadeLivros];
            clientes = new Cliente[capacidadeClientes];
            pedidos = new Pedido[capacidadePedidos];
            numLivros = 0;
            numClientes = 0;
            numPedidos = 0;
        }

        public void adicionarLivro(Livro livro) {
            if (numLivros < livros.length) {
                livros[numLivros++] = livro;
            } else {
                System.out.println("A capacidade máxima de livros foi atingida.");
            }
        }

        public void adicionarCliente(Cliente cliente) {
            if (numClientes < clientes.length) {
                clientes[numClientes++] = cliente;
            } else {
                System.out.println("A capacidade máxima de clientes foi atingida.");
            }
        }

        public void adicionarPedido(Pedido pedido) {
            if (numPedidos < pedidos.length) {
                pedidos[numPedidos++] = pedido;
            } else {
                System.out.println("A capacidade máxima de pedidos foi atingida.");
            }
        }
    }

    public static void main(String[] args) {
            }
