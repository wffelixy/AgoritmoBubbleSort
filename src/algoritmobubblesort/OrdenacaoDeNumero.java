package algoritmobubblesort;

public class OrdenacaoDeNumero {

	public void ordenarNumeros(int[] numeros) {

		int qtdeNumeros = numeros.length;

		for (int iteracao = 0; iteracao < qtdeNumeros - 1; iteracao++) {
			for (int x = 0; x < qtdeNumeros - iteracao - 1; x++) {
				if (numeros[x] > numeros[x + 1]) {
					int temp = numeros[x];
					numeros[x] = numeros[x + 1];
					numeros[x + 1] = temp;
				}
			}
		}
	}

	public void printaArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
