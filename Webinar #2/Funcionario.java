
public class Funcionario {
	
	private String nome;
	private int idade;
	private Double salarioHora;
	private int horasMes;

	public Funcionario(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
		this.idade = 18;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(Double salarioHora) {
		if(salarioHora >= 10 && salarioHora <= 200)
			this.salarioHora = salarioHora;
		else
			System.out.println("Valor de salário hora inválido");
	}

	public int getHorasMes() {
		return horasMes;
	}

	public void setHorasMes(int horasMes) {
		if(horasMes <= 160)
			this.horasMes = horasMes;
		else
			System.out.println("Horas por mês exedeu o limite de 160 horas");
	}
	
	public void mostrarDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Salario: R$ "+calcularSalario());
	}
	
	public Double calcularSalario() {
		return this.salarioHora * this.horasMes;
	}
	
}
