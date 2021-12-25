package algoritmos;

import resultados.Resultado;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class InsertionSort {
	
	public static Resultado insertionSort(int[] vetor){
		
		long numeroTrocas = 0, numeroComparacoesChaves = 0;
		
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			numeroTrocas++;
			int j = i;
			
			numeroComparacoesChaves++;
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
				numeroComparacoesChaves++;
				numeroTrocas++;
			}
			vetor[j] = aux;
			numeroTrocas++;

		}
		
		return new Resultado(numeroTrocas, numeroComparacoesChaves);
	
	}
	
}
