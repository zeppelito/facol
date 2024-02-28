package entidade;

import java.util.ArrayList;

public class UsuarioRepositorio {
	private ArrayList<Usuario> UsuarioBD=new ArrayList<Usuario>();
	
	public  void salvar(Usuario novoUsuario) {		
			UsuarioBD.add(novoUsuario);
	}
	
	public ArrayList<Usuario> listarTodos(){
		return UsuarioBD;
	}
	
	public Usuario pesquisarPorCpf(Usuario UsuarioP) {
		Usuario resultadoPesquisa=null;
		for (Usuario Usuario : UsuarioBD) {
			if(Usuario.getId().equals(UsuarioP.getId())) {
				resultadoPesquisa=Usuario;
				break;
			}			
		}
		return resultadoPesquisa;
	}
	
}
