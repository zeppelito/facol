package entidade;

import java.util.ArrayList;

public interface IUsuarioServico {
	public void cadastrar(Usuario novoUsuario);
	public void alterar(Usuario novoUsuario);
	public ArrayList<Usuario> listarTodos();
	public boolean removerPorId(Usuario novoUsuario);
}
	