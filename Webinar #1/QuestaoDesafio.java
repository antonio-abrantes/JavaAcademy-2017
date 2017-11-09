
public class QuestaoDesafio {

	public static void main(String[] args) {
		
	  	double valorInvestido = 5000.00, taxaJuros = 0.01, montante;
		int meses = 12;
		
		// montante = valorInvestido * (1+taxa)elevado a tempo
		montante = valorInvestido * Math.pow(1 + taxaJuros, meses);
		
		System.out.printf("Motante Total: R$ %.2f\n", montante);

	}

}