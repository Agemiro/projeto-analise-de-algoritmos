package resultados;

/**
 * 
 * @author Agemiro Neto
 *
 */
public class Resultado {
	
	private long numeroTrocas;
	private long numeroComparacoes;
	
	public Resultado(long numeroTrocas, long numeroComparacoes) {
		this.numeroTrocas = numeroTrocas;
		this.numeroComparacoes = numeroComparacoes;
	}

	public long getNumeroTrocas() {
		return numeroTrocas;
	}

	public long getNumeroComparacoes() {
		return numeroComparacoes;
	}

}
