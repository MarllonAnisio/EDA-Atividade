package fila;

public class FilaEstaticaMain {

	public static void main(String[] arg) {
		
		try{
            EdaFila e = new FilaEstatica(10);

            e.enfileirar(7);
            e.enfileirar(77);
            e.enfileirar(41);
            e.enfileirar(3);
            e.enfileirar(75);
            e.enfileirar(95);
            e.imprimir();
            e.desenfileirar();
            e.desenfileirar();
            e.imprimir();
            
        }
        catch(FilaVaziaException e){
            e.printStackTrace();

        }catch(FilaCheiaException e) {
        	e.printStackTrace();
        }

    }
}


