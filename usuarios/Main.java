package entidade;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Usuario> alunos=new ArrayList<Usuario>();
	public static void cadastrarAluno(String nome) {
		if(!nome.isBlank() && !nome.isEmpty()) {
		
			Aluno Usuario=new Usuario(nome, "Id", "Emprestimo",);
			Usuarios.add(Usuario);
		}
	}
	
	public static void main(String[] args) {
		cadastrarUsuario("nome");
		 
		IUsuarioServico UsuarioServico=new UsuarioServico();
		IUsarioPServico UsuarioPServico=new UsuarioServico();
		UsuarioPServico.
	}

}
