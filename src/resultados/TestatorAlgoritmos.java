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
	 * Aqui contém todos os métodos que usam os algoritmos, recebendo um tamanho de vetor específico que vai para o gerador de
	 * valores desejado para assim pegar esse vetor gerado para ser parametro de todos os algoritmos, trazendo as informações 
	 * de cada situação.
	 * Obs.: Todas as vezes em for usar algum método de ordenação, será pego na verdade um clone do vetor, para que o
	 * próximo algoritmo a ser usado não tenha o problema de pegar um vetor já ordenado.
	 */
	
	public static void testarComValoresOrdenados(int tamanho) {
		int[] vetor = GeradorValores.gerarValoresOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresInversamenteOrdenados(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresInversamenteOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresQuaseOrdenados(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresQuaseOrdenados(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
	public static void testarComValoresAleatorios(int tamanho) {
		
		int[] vetor = GeradorValores.gerarValoresAleatorios(tamanho);
		
		System.out.println("\n->TAMANHO: " + tamanho);
		System.out.println("\n[InsertionSort]");
		inicio = System.currentTimeMillis();
		resultado = InsertionSort.insertionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[SelectionSort]");
		inicio = System.currentTimeMillis();
		resultado = SelectionSort.selectionSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[BubbleSort]");
		inicio = System.currentTimeMillis();
		resultado = BubbleSort.bubbleSort(vetor.clone());
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[MergeSort]");
		inicio = System.currentTimeMillis();
		resultado = MergeSort.mergeSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
		System.out.println("\n[QuickSort]");
		inicio = System.currentTimeMillis();
		resultado = QuickSort.quickSort(vetor.clone(), 0, tamanho-1);
		fim = System.currentTimeMillis();
		System.out.println("Número de comparações de chaves: " + resultado.getNumeroComparacoes() + "\nNúmero de movimentações de registro (Trocas): " + resultado.getNumeroTrocas() +"\nTempo de processamento: " + (fim-inicio));
		
	}
	
}
