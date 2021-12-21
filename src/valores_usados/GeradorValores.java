package valores_usados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class GeradorValores {
	
	//atributo do vetor que será usado nos algoritmos de ordenação
	private static int[] vetor;
	
	/**
	 * Método estático que gera valores ordenados para o vetor em questão.
	 * @param tamanho
	 * @return vetor
	 */
	public static int[] gerarValoresOrdenados(int tamanho) { 
		vetor = new int[tamanho]; 

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = i + 1;
		}

		return vetor;
	}
	
	/**
	 * Método estático que gera valores inversamente ordenados para o vetor em questão.
	 * @param tamanho
	 * @return vetor
	 */
	public static int[] gerarValoresInversamenteOrdenados(int tamanho) {
		vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = tamanho--;
		}

		return vetor;
	}
	
	/**
	 * Método estático que gera valores quase ordenados para o vetor em questão.
	 * @param tamanho
	 * @return vetor
	 */	
	public static int[] gerarValoresQuaseOrdenados(int tamanho) {
		//Apenas 50% do vetor vai estar ordenado
		int ordenado = (tamanho / 2);

		vetor = new int[tamanho];

		List<Integer> listaSegundaMetade = new ArrayList<>();

		for (int i = 0; i < ordenado; i++) {
			vetor[i] = i + 1;
		}

		for (int i = ordenado; i < tamanho; i++) {
			listaSegundaMetade.add(i + 1);
		}

		//Embaralha os elementos da lista
		Collections.shuffle(listaSegundaMetade);
		
		int cont = 0;
		
		for (int i = ordenado; i < tamanho; i++) {
			vetor[i] = listaSegundaMetade.get(cont);
			cont += 1;
		}

		return vetor;
	}
	/**
	 * Método estático que gera valores aleatórios para o vetor em questão.
	 * @param tamanho
	 * @return vetor
	 */	
	public static int[] gerarValoresAleatorios(int tamanho) {
		vetor = new int[tamanho];
		
		List<Integer> listaAux = new ArrayList<>();

		for (int i = 0; i < vetor.length; i++) {
			listaAux.add(i + 1);
		}

		//Embaralha os elementos da lista
		Collections.shuffle(listaAux);

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = listaAux.get(i);
		}

		return vetor;
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(GeradorValores.gerarValoresOrdenados(10)));
		
		System.out.println(Arrays.toString(GeradorValores.gerarValoresInversamenteOrdenados(10)));
		
		System.out.println(Arrays.toString(GeradorValores.gerarValoresQuaseOrdenados(8)));
		
		System.out.println(Arrays.toString(GeradorValores.gerarValoresAleatorios(10)));
	
	}
}
