package InvertaSequencia;

public class Inverter {

	public void inverterSequencia(int[] numeros) {
		String most = "";
		if (numeros == null) {
			System.out.println("array vazio");
		} else {
			for (int i = numeros.length - 1; i >= 0; i--) {
				most += numeros[i] + ",";
			}
		}
		System.out.println(most);
	}

	public String ordenarLista(int[] numeros) {
		String most = "";
		int cont = numeros.length;
		boolean troca = false;
		if (numeros == null) {
			System.out.println("Lista vazia");
		}else {

			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i + 1] < numeros[i]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
					troca = true;
				}
				cont--;
				if (troca == true) {
					ordenarLista(numeros);

				}
				if (cont == 1) {
					cont =0;
					break;
				}
			}
			for (int i = 0; i < numeros.length; i++) {
				most += numeros[i] + ",";
			}
			
		}
		return most;

	}

}
