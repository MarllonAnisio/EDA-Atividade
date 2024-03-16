package fila;

public class FilaEstatica implements EdaFila{
	
	public int array[];
	public int tamanho;
	public int inicio = -1;
	public FilaEstatica(int tamanho){
	     array = new int[tamanho];
	   }
	  
	    public void enfileirar(int e) throws FilaCheiaException{
	    	if(isCheia()){
	    		throw new FilaCheiaException();
	    }

	    array[++inicio] = e;
	    tamanho++;
	    }

	    @Override
	    public void desenfileirar() throws FilaVaziaException {
	       if(isVazia())
	           throw new FilaVaziaException();

	       for(int i=0; i<tamanho-1; i++){
	           array[i] = array[i+1];
	       }
	       tamanho--;
	    }

	    @Override
	    public int quantidade() {
	        return inicio+1;
	    }

	    @Override
	    public boolean isCheia() {
	        return inicio == array.length-1;
	    }

	    @Override
	    public boolean isVazia() {
	        return inicio == -1;
	    }

	    @Override
	    public void imprimir() {

	        for(int i=0; i< tamanho; i++){

	            System.out.print(array[i]+" ");
	        }
	        System.out.println("  ");
	    }



	}

