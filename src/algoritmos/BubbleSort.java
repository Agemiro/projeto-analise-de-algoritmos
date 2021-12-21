package algoritmos;

import resultados.Resultado;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class BubbleSort {
	
	public static Resultado bubbleSort(int[] vetor){
		
		long numeroTrocas = 0, numeroComparacoesChaves = 0;

		int i = 0;
		boolean troca = true;
		
		while(i < vetor.length-1 && troca == true) {
			troca = false;
			for(int j = 0; j < vetor.length-1; j++){
				if(vetor[j] > vetor[j + 1]){
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					troca = true;
					numeroTrocas+=3;
				}
				numeroComparacoesChaves++;
			}
			numeroComparacoesChaves++;
		}
		
		return new Resultado(numeroTrocas, numeroComparacoesChaves);
		
	}

}
