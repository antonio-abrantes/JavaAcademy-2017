
public class Main {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Antonio Abrantes", 25);
		f1.setSalarioHora(20.00);
		f1.setHorasMes(161);
		
		Analista a1 = (Analista)Empresa.criarFuncionario(Empresa.ANALISTA, "Fulano de Tal", 25);
		a1.setHorasMes(150);
		a1.setSalarioHora(23.60);
		a1.setSetor("Analista Pleno");
		
		Analista a2 = (Analista)Empresa.criarFuncionario(Empresa.ANALISTA, "Mais um Fulano");
		a2.setHorasMes(150);
		a2.setSalarioHora(23.60);
		a2.setSetor("Analista Junior");
		
		Gerente g1 = (Gerente)Empresa.criarFuncionario(Empresa.GERENTE,"Ciclno Junior", 41);
		g1.setHorasMes(158);
		g1.setSalarioHora(35.00);
		g1.setBonus(50.00);
		
		f1.mostrarDados();
		a1.mostrarDados();
		a2.mostrarDados();
		g1.mostrarDados();

	}

}
