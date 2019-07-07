package ListaEncadeada;

public class Teste {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.add(4);
		lista.add(0);
		lista.add(8);
		lista.add(10);
		lista.add(3);
		lista.add(2);
		lista.add(5);
		lista.add(1);
		
		lista.listar(lista);
		
	/*	System.out.println("O primeiro elemento é: " + lista.getPrimeiro().getNumero());
		System.out.println("O Ultimo elemento é: " + lista.getUltimo().getNumero());
		System.out.println("A quantidade de elemento é: " + lista.getQtd() + "\n");
		
		lista.removerIni(lista);
		
		System.out.println("O primeiro elemento é: " + lista.getPrimeiro().getNumero());
		System.out.println("O Ultimo elemento é: " + lista.getUltimo().getNumero());
		System.out.println("A quantidade de elemento é: " + lista.getQtd()+ "\n");
		
		
		lista.removerFim(lista);
		
		System.out.println("O primeiro elemento é: " + lista.getPrimeiro().getNumero());
		System.out.println("O Ultimo elemento é: " + lista.getUltimo().getNumero());
		System.out.println("A quantidade de elemento é: " + lista.getQtd()+ "\n");
		*/
		
		lista.ordemDecrescente(lista);
		
		lista.listar(lista);
		
	}
}
