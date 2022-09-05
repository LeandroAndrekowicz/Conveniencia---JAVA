
public class Produtos {
	private String bebidas;
	private String lanches;
	private String pasteis;
	private double precoBebidas;
	private double precoLanches;
	private double precoPasteis;
	
	public Produtos(String bebidas, double precoBebidas, String lanches, double precoLanches, String pasteis, double precoPasteis) {
		this.bebidas = bebidas;
		this.precoBebidas = precoBebidas;
		this.lanches = lanches;
		this.precoLanches = precoLanches;
		this.pasteis = pasteis;
		this.precoPasteis = precoPasteis;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	public String getLanches() {
		return lanches;
	}

	public void setLanches(String lanches) {
		this.lanches = lanches;
	}

	public String getPasteis() {
		return pasteis;
	}

	public void setPasteis(String pasteis) {
		this.pasteis = pasteis;
	}

	public double getPrecoBebidas() {
		return precoBebidas;
	}

	public void setPrecoBebidas(double precoBebidas) {
		this.precoBebidas = precoBebidas;
	}

	public double getPrecoLanches() {
		return precoLanches;
	}

	public void setPrecoLanches(double precoLanches) {
		this.precoLanches = precoLanches;
	}

	public double getPrecoPasteis() {
		return precoPasteis;
	}

	public void setPrecoPasteis(double precoPasteis) {
		this.precoPasteis = precoPasteis;
	}
	
}
