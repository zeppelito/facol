  public static class Livraria {
        private Livro[] livros;
        private Cliente[] clientes;
        private Pedido[] pedidos;
        private int numLivros;
        private int numClientes;
        private int numPedidos;

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
        Livraria livraria = new Livraria(10, 10, 10);
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar cliente");
            System.out.println("3. Realizar pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar a linha após a entrada numérica

            switch (opcao) {
                case 1:
                    System.out.print("Informe o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Informe o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Informe o ano de publicação do livro: ");
                    int anoPublicacao = scanner.nextInt();
                    scanner.nextLine();  // Limpar a linha após a entrada numérica
                    System.out.print("Informe o gênero do livro: ");
                    String genero = scanner.nextLine();
                    System.out.print("Informe o preço do livro: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();  // Limpar a linha após a entrada numérica

                    Livro novoLivro = new Livro(titulo, autor, anoPublicacao, genero, preco);
                    livraria.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Informe o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe o email do cliente: ");
                    String email = scanner.nextLine();
                    System.out.print("Informe o endereço do cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Informe o telefone do cliente: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Informe a idade do cliente: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  // Limpar a linha após a entrada numérica

                    Cliente novoCliente = new Cliente(nome, email, endereco, telefone, idade);
                    livraria.adicionarCliente(novoCliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case 3:
                    // Lógica para realizar um pedido
                    if (livraria.numClientes == 0 || livraria.numLivros == 0) {
                        System.out.println("Não há clientes ou livros cadastrados para realizar um pedido.");
                    } else {
                        System.out.print("Escolha um cliente (0-" + (livraria.numClientes - 1) + "): ");
                        int clienteIndex = scanner.nextInt();
                        scanner.nextLine();  // Limpar a linha após a entrada numérica

                        System.out.print("Escolha um livro (0-" + (livraria.numLivros - 1) + "): ");
                        int livroIndex = scanner.nextInt();
                        scanner.nextLine();  // Limpar a linha após a entrada numérica

                        System.out.print("Informe a quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();  // Limpar a linha após a entrada numérica

                        if (clienteIndex >= 0 && clienteIndex < livraria.numClientes &&
                            livroIndex >= 0 && livroIndex < livraria.numLivros) {
                            Cliente cliente = livraria.clientes[clienteIndex];
                            Livro livro = livraria.livros[livroIndex];

                            Pedido pedido = new Pedido(livraria.numPedidos + 1, cliente, livro, quantidade);
                            livraria.adicionarPedido(pedido);
                            System.out.println("Pedido realizado com sucesso!");
                        } else {
                            System.out.println("Cliente ou livro selecionado não existe.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
