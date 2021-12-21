package algoritmos;

import resultados.Resultado;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class SelectionSort {
	
	public static Resultado selectionSort(int[] vetor){
		
		long numeroTrocas = 0, numeroComparacoesChaves = 0;
		
		for (int i = 0; i < vetor.length - 1; i++)  {  
			 
			int indiceMenorNumero = i;  
			 
	        for (int j = i + 1; j < vetor.length; j++){  
	        	if (vetor[j] < vetor[indiceMenorNumero]){  
	        		indiceMenorNumero = j; //Indice do número mais baixo no momento
	        	}  
        		numeroComparacoesChaves++;
	        }  
	        
	        int menorNumero = vetor[indiceMenorNumero];   
	        vetor[indiceMenorNumero] = vetor[i];  
	        vetor[i] = menorNumero; 
	       
	        numeroTrocas+=3;
    		numeroComparacoesChaves++;
	         
	    }  
		 
		return new Resultado(numeroTrocas, numeroComparacoesChaves);
		 
	}
	//Comp chaves é quando compara os elementos que estão dentro do array
}
