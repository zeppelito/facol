package entidade;

import java.util.ArrayList;

public class UsuarioServico implements IUsuarioServico,IUsarioPServico{
	private UsuarioRepositorio UsuarioRepo=new UsuarioRepositorio();
	
	public void cadastrar(String nome) {
		if(!nome.isBlank() && !nome.isEmpty()) {		
			Usuario Usuario=new Usuario(nome, "Id", "Emprestimo",);
			UsuarioRepo.salvar(Usuario);
			
		}
	}
	public void imprimirNomesUsuarios() {
		ArrayList<Usuario> Usuario= Usuario.listarTodos();
		for (Usuario Usuario : Usuario) {
			System.out.println("Nome Usuario:"+Usuario.getNome());
		}
	}
	public void pesquisarPorId(String cpf) {
		if(!Id.isBlank() && !Id.isEmpty() && Id.length()>0) {
			Usuario UsuarioP=new Usuario(null, cpf, null, null, null);
			Usuario resultado=UsuarioRepo.pesquisarPorId(UsuarioP);
			System.out.println("Nome:"+resultado.getNome());
			System.out.println("Livro:"+resultado.getLivro());
		}
	}
	@Override
	public void cadastrar(String nome, String Id, Boolean Emprestimo,) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cadastrar(Aluno novoUsuario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterar(String nome, String Id, Boolean Emprestimo,) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removerPorId(String Id) {
		// TODO Auto-generated method stub
		
	}
	
	public void deletar(String Livro) {}

}
