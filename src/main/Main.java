package main;

import resultados.TestatorAlgoritmos;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class Main {
	
	/*
	 * Foram escolhidos seis tamanhos/quantidades diferentes de vetores pra serem ordenados por diferentes
	 * algoritmos. Inicialmente esse tamanho é passado como parametro no metodo em questão, que pode ser
	 * ordenado, aleatorio, quase ordenado e inversamente ordenado que serão testados na classe TestadorAlgoritmos. 
	 */
	
	public static void vetorOrdenado() {
		System.out.println("->COM VALORES ORDENADOS<-"); 
		TestatorAlgoritmos.testarComValoresOrdenados(10);
		TestatorAlgoritmos.testarComValoresOrdenados(100);
		TestatorAlgoritmos.testarComValoresOrdenados(1000);
		TestatorAlgoritmos.testarComValoresOrdenados(10000);
		TestatorAlgoritmos.testarComValoresOrdenados(100000);
		TestatorAlgoritmos.testarComValoresOrdenados(1000000);
	}
	
	public static void vetorInversamenteOrdenado() {
		System.out.println("\n->COM VALORES INVERSAMENTE ORDENADOS<-");
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(10);
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(100);
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(1000);
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(10000);
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(100000);
		TestatorAlgoritmos.testarComValoresInversamenteOrdenados(1000000);
	}
	
	public static void vetorQuaseOrdenado() {
		System.out.println("\n->COM VALORES QUASE ORDENADOS<-");
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(10);
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(100);
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(1000);
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(10000);
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(100000);
		TestatorAlgoritmos.testarComValoresQuaseOrdenados(1000000);
	}
	
	public static void vetorAleatorio() {
		System.out.println("\n->COM VALORES ALEATÓRIOS<-");
		TestatorAlgoritmos.testarComValoresAleatorios(10);
		TestatorAlgoritmos.testarComValoresAleatorios(100);
		TestatorAlgoritmos.testarComValoresAleatorios(1000);
		TestatorAlgoritmos.testarComValoresAleatorios(10000);
		TestatorAlgoritmos.testarComValoresAleatorios(100000);
		TestatorAlgoritmos.testarComValoresAleatorios(1000000);
	}
	
	public static void main(String[] args) {
		
		Main.vetorOrdenado();
		Main.vetorInversamenteOrdenado();
		Main.vetorQuaseOrdenado();
		Main.vetorAleatorio();
		
	}
	
}
