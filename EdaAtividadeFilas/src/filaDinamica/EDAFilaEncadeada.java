package filaDinamica;

import fila.FilaVaziaException;

public class EDAFilaEncadeada implements EDAFila {

	private EDANo noInicio;
	public EDANo noFinal;
	private int qElementos;

	public void enfileirar(int e) {

		EDANo no = new EDANo(e);
		qElementos++;

		if (isVazia()) {
			noInicio = no;
			noFinal = no;
		} else {
			noFinal.proximo = no;
			noFinal=no;

		}


	}

	public int desenfileirar() throws FilaVaziaException {
		qElementos--;
		
		if (isVazia() || qElementos<=0) {
			throw new FilaVaziaException();
		}

		EDANo lixo = noInicio;
		noInicio = noInicio.proximo;

		return lixo.dado;
	}

	public int quantidade() {
		return qElementos;
	}

	public boolean isCheia() {
		return false;
	}

	public boolean isVazia() {
		return noInicio == null;
	}

	public void imprimir() {
		EDANo e = noInicio;
		if(!isVazia()) {
			
			for(int i = 0; i<qElementos; i++) {
				System.out.print(noInicio.dado +" ");
				
				noInicio = noInicio.proximo;
			}
			System.out.println(" ");
		}
		
		noInicio = e;
	}
	
				
	
}
