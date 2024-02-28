package entidade;

public class Aluno {
	private String nome;
	private String Id;
	private Boolean Emprestimo;
	
	public Aluno(String nome, String Id, Boolean Emprestimo,) {
		this.nome = nome;
		this.Id = Id;
		this.Emprestimo = Emprestimo;

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public Boolean Emprestimo() {
		return Emprestimo;
	}
	public void setEmprestimo(Boolean Emprestimo) {
		this.Emprestimo = Emprestimo;
	}
	
}
