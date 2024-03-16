package fila;

public interface EdaFila {
    public void enfileirar(int e) throws FilaCheiaException;
    public void desenfileirar() throws FilaVaziaException;
    public int quantidade();
    public boolean isCheia();
    public boolean isVazia();
    public void imprimir();
}
