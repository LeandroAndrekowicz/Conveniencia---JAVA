import java.util.Random;
public class utilitarioNotaFiscal {
	public void imprimirNotaFiscal(Produtos[] produtos , NotaFiscal notaFiscal, Cliente cliente) {
		int min = 0;
		int max = 4;
		double totalBebidas = 0;
		double totalLanches = 0;
		double totalPasteis = 0;
		double total = 0;
 		Random random = new Random();
		int i = random.nextInt(min + max) + min;
		totalBebidas = (produtos[i].getPrecoBebidas() * notaFiscal.getQntBebidas());
		totalLanches = (produtos[i].getPrecoLanches() * notaFiscal.getQntLanches());
		totalPasteis = (produtos[i].getPrecoPasteis() * notaFiscal.getQntPasteis());
		total = totalBebidas + totalLanches + totalPasteis;
		System.out.println(" ________________________________________");
		System.out.println("| Nota Fiscal num: "+notaFiscal.getCodBarras());
		System.out.println("| Cliente: "+cliente.getNome() + " CPF: "+ cliente.getCpf());
		System.out.println("| Bebidas: "+produtos[i].getBebidas()+ "|" +" Quantidade: "+notaFiscal.getQntBebidas());
		System.out.println("| Lanches: "+produtos[i].getLanches()+ "|" +" Quantidade: "+notaFiscal.getQntLanches());
		System.out.println("| Pasteis: "+produtos[i].getPasteis()+ "|" +" Quantidade: "+notaFiscal.getQntPasteis());
		System.out.println("| Total: "+total+" R$");
		System.out.println(" ________________________________________");
	}
	public void imprimirProdutos(Produtos[] produtos) {
		System.out.println(" ___________________________________________");
		System.out.println("|Bebidas        |"+"Lanches      |"+"Pasteis      |");
		System.out.println(" -------------------------------------------");
		for (int i = 0; i <produtos.length; i++) {
			if(produtos[i] != null) {
				System.out.println("|"+produtos[i].getBebidas()+"     " + produtos[i].getLanches()+"         " + produtos[i].getPasteis());
			}
		}
	}
}
