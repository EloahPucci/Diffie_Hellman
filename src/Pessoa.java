
public class Pessoa {
	private Long q = (long) 353;
	private Long raizPrimitivaDe_q = (long) 3;
	private Long chavePublica;
	private Long chavePrivada;
	private Long chavePublicaRecebida;
	
	public void calculoChavePublica() {
		this.chavePublica = (long) Math.pow(this.raizPrimitivaDe_q, this.chavePrivada) % q;
	}

	public Long getQ() {
		return q;
	}

	public void setQ(Long q) {
		this.q = q;
	}

	public Long getRaizPrimitivaDe_q() {
		return raizPrimitivaDe_q;
	}

	public void setRaizPrimitivaDe_q(Long raizPrimitivaDe_q) {
		this.raizPrimitivaDe_q = raizPrimitivaDe_q;
	}

	public Long getChavePublica() {
		return chavePublica;
	}

	public void setChavePublica(Long chavePublica) {
		this.chavePublica = chavePublica;
	}

	public Long getChavePrivada() {
		return chavePrivada;
	}

	public void setChavePrivada(Long chavePrivada) {
		this.chavePrivada = chavePrivada;
	}

	public Long getChavePublicaRecebida() {
		return chavePublicaRecebida;
	}

	public void setChavePublicaRecebida(Long chavePublicaRecebida) {
		this.chavePublicaRecebida = chavePublicaRecebida;
	}

}
