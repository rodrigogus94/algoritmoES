package InvertaSequencia;

public class Teste {
	
	public static void main(String[] args) {
		
		Inverter a = new Inverter();
		
		int[] array = {20,9,5,14,3,2};
		
		a.inverterSequencia(array);

		
		System.out.println(a.ordenarLista(array));
	}

}
