package filaDinamica;

import fila.FilaVaziaException;

public class Main {
	public static void main(String[] args) {
		
		//sequência: 10, 5, 3,4, 2,1
		
		try {
			EDAFilaEncadeada e = new EDAFilaEncadeada();
			e.enfileirar(10);
			e.enfileirar(5);
			e.enfileirar(6);
			
			e.enfileirar(4);
			e.enfileirar(2);
			e.enfileirar(1);
			//e.imprimir();

			e.desenfileirar();
			e.desenfileirar();
			e.desenfileirar();
			e.imprimir();
			
			
			
			e.enfileirar(21);
			e.enfileirar(13);
			e.imprimir();

		} catch (FilaVaziaException e1) {
			e1.printStackTrace();
		}

	}
}
