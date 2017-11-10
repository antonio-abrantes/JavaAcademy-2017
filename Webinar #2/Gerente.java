
public class Gerente extends Funcionario {

	private Double bonus;
	
	public Gerente(String nome, int idade) {
		super(nome, idade);
	}

	public Gerente(String nome) {
		super(nome);
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
		
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Bonus: R$ "+this.bonus);
		System.out.println("Salário total: R$ "+(super.calcularSalario() + this.bonus));
	}
}
