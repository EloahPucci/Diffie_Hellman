import java.math.BigDecimal;

public class Pessoa {
	private BigDecimal chavePublica;
	private Integer chavePrivada;
	private BigDecimal chavePublicaRecebida;	
	
	public Pessoa(Integer chavePrivada) {
		super();
		this.chavePrivada = chavePrivada;
	}

	// Cálculo da chave pública
	public BigDecimal calculoChavePublica(BigDecimal q, BigDecimal raizPrimitivaDe_q) {
		return calculoPotencia(raizPrimitivaDe_q, this.chavePrivada).remainder(q);
	}
	
	// Cálculo da chave publica comum
	public BigDecimal calculoChaveSecretaComum(BigDecimal q, BigDecimal chavePublica, Integer chavePrivada) {
		return calculoPotencia(chavePublica, chavePrivada).remainder(q);
	}
	
	// Esta função faz cálculo de potência
	public BigDecimal calculoPotencia(BigDecimal base, Integer expoente) {
		BigDecimal result = new BigDecimal(0);
		for(int i = 1; i <= chavePrivada; i++) {
			result = result.multiply(base);
		}
		return result;
	}

	public BigDecimal getChavePublica() {
		return chavePublica;
	}

	public void setChavePublica(BigDecimal chavePublica) {
		this.chavePublica = chavePublica;
	}

	public Integer getChavePrivada() {
		return chavePrivada;
	}

	public void setChavePrivada(Integer chavePrivada) {
		this.chavePrivada = chavePrivada;
	}

	public BigDecimal getChavePublicaRecebida() {
		return chavePublicaRecebida;
	}

	public void setChavePublicaRecebida(BigDecimal chavePublicaRecebida) {
		this.chavePublicaRecebida = chavePublicaRecebida;
	}
}
