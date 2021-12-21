package algoritmos;

import java.util.Arrays;

import resultados.Resultado;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class MergeSort {
	
	private static long numeroTrocas = 0, numeroComparacoesChaves = 0;
	
	public static void mergeSort(int[] vetor, int inicio, int meio, int fim){
				
		int[] auxiliar = Arrays.copyOf(vetor, vetor.length);
		int i = inicio;
		int j = meio+1;
		int pos = i;
		while (i <= meio && j <= fim) {
			numeroComparacoesChaves++;
			if (auxiliar[i] < auxiliar[j]) {
				vetor[pos] = auxiliar[i];
				i++;
				numeroTrocas++;
			} else {
				vetor[pos] = auxiliar[j];
				j++;
				numeroTrocas++;
			}
			pos++;
		}
		while (i <= meio) {
			//numeroComparacoesChaves++;
			vetor[pos++] = auxiliar[i++];
			numeroTrocas++;
		}
		while (j <= fim) {
			//numeroComparacoesChaves++;
			vetor[pos++] = auxiliar[j++];
			numeroTrocas++;
		}
	}
	
	public static Resultado mergeSort(int[] vetor, int indiceInicial, int indiceFinal) {
		
		if (indiceInicial < indiceFinal) {
			int meio = (indiceInicial+indiceFinal)/2;
			mergeSort(vetor, indiceInicial, meio);
			mergeSort(vetor, meio + 1, indiceFinal);
			mergeSort(vetor, indiceInicial, meio, indiceFinal);
		}
		
		return new Resultado(numeroTrocas, numeroComparacoesChaves);
		
	}

}
