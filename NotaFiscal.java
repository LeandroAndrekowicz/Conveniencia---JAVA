
public class NotaFiscal {
	private int qntBebidas;
	private int qntLanches;
	private int qntPasteis;
	private String formaPagamento;
	private int codBarras;

	
	public NotaFiscal(int qntBebidas, int qntLanches, int qntPasteis, String formaPagamento, int codBarras) {
		this.qntBebidas = qntBebidas;
		this.qntLanches = qntLanches;
		this.qntPasteis = qntPasteis;
		this.formaPagamento = formaPagamento;
		this.codBarras = codBarras;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public int getQntBebidas() {
		return qntBebidas;
	}

	public void setQntBebidas(int qntBebidas) {
		this.qntBebidas = qntBebidas;
	}

	public int getQntLanches() {
		return qntLanches;
	}

	public void setQntLanches(int qntLanches) {
		this.qntLanches = qntLanches;
	}

	public int getQntPasteis() {
		return qntPasteis;
	}

	public void setQntPasteis(int qntPasteis) {
		this.qntPasteis = qntPasteis;
	}
	
}
