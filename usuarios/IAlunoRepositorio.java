package entidade;

public interface IAlunoRepositorio {
	public void cadastrar(String nome, String Id,Boolean Emprestimo,);
	public void cadastrar(Aluno novoUsuario);
	public void alterar(String nome, String Id,Boolean Emprestimo,);
	public void listarTodos();
	public void removerPorId(String Id);
}
