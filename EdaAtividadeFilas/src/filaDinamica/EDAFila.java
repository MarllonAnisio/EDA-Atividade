package filaDinamica;

import fila.FilaCheiaException;
import fila.FilaVaziaException;

public interface EDAFila {
	public void enfileirar(int e) throws FilaCheiaException;
	public int desenfileirar() throws FilaVaziaException;
	public int quantidade();
	public boolean isCheia();
	public boolean isVazia();
	public void imprimir();
}
