package Fila;

import java.util.Arrays;

public class Fila {

	private int[] valores;
	private int cauda;
	private int tamanho;

	public Fila(int tamanho) {
		this.tamanho = tamanho;
		this.cauda = tamanho;
		this.valores = new int[tamanho];
	}

	public void inserir(int elemento) {
		if(cauda == tamanho) {
			cauda++;
		}
		
		if (tamanho >= cauda) {
			 valores[--cauda] = elemento;

		}
		most();
	}
	
	public void most() {
		String res ="";
		for (int i = 0; i < valores.length; i++) {
			res += valores[i] + ",";
		}
		
		System.out.println(res);
	}

	

	public void inserirFinal(int elemento) {
		if (cauda < tamanho) {
			valores[cauda++] = elemento;
		}
	}

	public int remover() {
		int temp = valores[0];
		for (int i = cauda - 1; i >= 0; i--) {
			valores[i] = valores[i - 1];
		}
		cauda--;

		return temp;
	}

	public void imprimirConteudo() {
		System.out.println(Arrays.toString(Arrays.copyOf(valores, cauda - 1)));
	}
}
