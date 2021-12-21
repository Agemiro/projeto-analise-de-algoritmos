package algoritmos;

import java.util.Arrays;
import java.util.Random;

import resultados.Resultado;
import valores_usados.GeradorValores;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class QuickSort {
		
	public static Resultado quickSort(int[] vetor, int indiceInicial, int indiceFinal){
		
		long numeroTrocas = 0, numeroComparacoesChaves = 0;
		
		Random random = new Random();
        int indiceAleatorio = random.nextInt(indiceFinal - indiceInicial + 1) + indiceInicial;
        
        int esquerda, direita, pivo, aux;
        
        esquerda = indiceInicial;
        direita = indiceFinal;
        pivo = vetor[indiceAleatorio];
        
        while(esquerda < direita){
        	while (vetor[esquerda] < pivo) { 
        		esquerda = esquerda + 1;
        		numeroComparacoesChaves++;
            }
            while (vetor[direita] > pivo){
                direita = direita - 1;
        		numeroComparacoesChaves++;
            }
            if (esquerda <= direita){
            	aux  = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = aux;
                esquerda = esquerda + 1;
                direita = direita - 1;
                numeroTrocas+=3;
            }
            numeroComparacoesChaves++;
         }
        
         if (direita > indiceInicial) {
        	 quickSort(vetor, indiceInicial, direita);
         }
         if (esquerda < indiceFinal) {
        	 quickSort(vetor, esquerda, indiceFinal);
         }
         
         return new Resultado(numeroTrocas, numeroComparacoesChaves);
        	 
	}
	
	public static void main(String[] args) {
		
		int[] i = GeradorValores.gerarValoresAleatorios(1000);
		
		System.out.println(Arrays.toString(i));
		QuickSort.quickSort(i, 0, i.length-1);
		//System.out.println(Arrays.toString(QuickSort.quickSort(i, 0, i.length-1)));
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		Random random = new Random();
        int indiceAleatorio = random.nextInt(999 - 0 + 1) + 0;
        
        System.out.println("R: "+indiceAleatorio);
	}

}
