package algoritmobubblesort;

public class Main {

	public static void main(String[] args) {

		int[] v = { 5, 3, 2, 4, 7, 1, 0, 6 };

		OrdenacaoDeNumero objOrdenacao = new OrdenacaoDeNumero();

		System.out.println("Vetor inicial:");
		objOrdenacao.printaArray(v);

		objOrdenacao.ordenarNumeros(v);

		System.out.println("\n" + "Vetor final:");
		objOrdenacao.printaArray(v);
	}

}
