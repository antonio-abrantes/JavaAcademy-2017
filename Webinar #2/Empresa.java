
public class Empresa {
	
	public static final int GERENTE = 1;
	public static final int ANALISTA = 2;
	
	public static Funcionario criarFuncionario(int tipo, String nome, int idade) {
		
		Funcionario novo = null;
		
		if(tipo == GERENTE) {
			novo = new Gerente(nome, idade);
		}
		
		if(tipo == ANALISTA) {
			novo = new Analista(nome, idade);
		}
		
		return novo;
	}
	
public static Funcionario criarFuncionario(int tipo, String nome) {
		
		Funcionario novo = null;
		
		if(tipo == GERENTE) {
			novo = new Gerente(nome);
		}
		
		if(tipo == ANALISTA) {
			novo = new Analista(nome);
		}
		
		return novo;
	}
}
