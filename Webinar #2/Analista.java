
public class Analista extends Funcionario {
	
	private String setor;

	public Analista(String nome) {
		super(nome);
	}
	
	public Analista(String nome, int idade) {
		super(nome, idade);
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Setor: "+this.setor);
	}
}
