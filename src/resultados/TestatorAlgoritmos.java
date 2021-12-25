package resultados;

import algoritmos.BubbleSort;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.SelectionSort;
import valores_usados.GeradorValores;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class TestatorAlgoritmos {
	
	private static long inicio, fim;
	private static Resultado resultado;
	
	/**
	 * Aqui cont�m todos os m�todos que usam os algoritmos, recebendo um tamanho de vetor espec�fico que vai para o gerador de
	 * valores desejado para assim pegar esse vetor gerado para ser parametro de todos os algoritmos, trazendo as informa��es 
	 * de cada situa��o.
	 * Obs.: Todas as vezes em for usar algum m�todo de ordena��o, ser� pego na verdade um clone do vetor, para que o
	 * pr�ximo algoritmo a ser usado n�o tenha o problema de pegar um vetor j� ordenado.
	 */
	
	public static void testarComValoresOrdenados(int tamanho) {
		int[] vetor = GeradorValores.gerarValoresOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresInversamenteOrdenados(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresInversamenteOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresQuaseOrdenados(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresQuaseOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresAleatorios(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresAleatorios(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("N�mero de compara��es de chaves: " + resultado.getNumeroComparacoes() + "\nN�mero de movimenta��es de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
}
