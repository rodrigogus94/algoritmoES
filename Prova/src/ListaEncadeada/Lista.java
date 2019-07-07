package ListaEncadeada;

public class Lista {

	private Elemento primeiro;
	private Elemento ultimo;
	private int qtd;

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void add(int num) {
		Elemento novoObj = new Elemento();
		Elemento objAux = new Elemento();

		if (getQtd() == 0) {
			novoObj.setNumero(num);
			novoObj.setProximo(null);

			Lista.this.primeiro = novoObj;
			Lista.this.ultimo = novoObj;
			Lista.this.qtd++;
		} else {

			objAux = Lista.this.primeiro;

			while (objAux.getProximo() != null) {
				objAux = objAux.getProximo();

			}

			novoObj.setNumero(num);
			novoObj.setProximo(null);

			objAux.setProximo(novoObj);
			Lista.this.ultimo = novoObj;
			Lista.this.qtd++;

		}
	}

	public void listar(Lista lista) {
		Elemento aux = lista.primeiro;
		if (aux == null) {
			System.out.println("LIsta Vazia");
		}
		while (aux != null) {
			System.out.println(aux.getNumero());
			aux = aux.getProximo();
		}
	}

	public void pesquisar(Lista lista, int posicao) {
		Elemento aux = lista.primeiro;
		while (aux != null && aux.getNumero() != posicao) {
			aux = aux.getProximo();

		}
		if (aux == null) {
			System.out.println("nada");
		} else {
			System.out.println("Tem");
		}

	}

	public void removerIni(Lista lista) {
		if (lista.qtd == 0) {
			System.out.println("Lista Vazia ");
		} else {
			lista.primeiro = lista.primeiro.getProximo();
			lista.qtd--;
		}
	}

	public void removerFim(Lista lista) {
		Elemento aux = lista.primeiro;
		Elemento ant = lista.primeiro;
		if (lista.qtd == 0) {
			System.out.println("Lista Vazia ");
		} else {
			while (aux.getProximo() != null) {
				ant = aux;
				aux = aux.getProximo();
			}

			ant.setProximo(null);
			lista.ultimo = ant;
			lista.qtd--;

		}
	}

	public void ordemDecrescente(Lista lista) {
		Elemento aux = lista.primeiro;
		Elemento ant = lista.primeiro;
		Elemento troca;

		while (aux.getProximo() != null) {
			ant = aux;
			aux = aux.getProximo();
		}

		System.out.println("ant é: " + ant.getNumero());
		System.out.println("aux é: " + aux.getNumero());

		if (ant.getNumero() > aux.getNumero()) {
			troca = ant;
			ant.setNumero(aux.getNumero());
			aux.setNumero(troca.getNumero());
		}

		System.out.println("ant é: " + ant.getNumero());
		System.out.println("aux é: " + aux.getNumero());
	}

}
