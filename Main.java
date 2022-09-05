
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Leandro", "140.433.772.12");
		Produtos produtos[] = new Produtos[4];
		produtos[0] = new Produtos("Coca-Cola lata", 4.5, "X-tudo", 19.90, "4 Queijos", 10.50);
		produtos[1] = new Produtos("Pepsi lata", 3.5, "X-Egg", 15.60, "Carne", 11);
		produtos[2] = new Produtos("Kuat lata", 4, "X-Vegetariano", 22.50, "Pizza", 9.30);
		produtos[3] = new Produtos("Coca-Cola 2l", 11.50, "X-Tripa", 30.65, "Frango c/ catupiry", 12.30);
		
		NotaFiscal notaFiscal = new NotaFiscal(2, 0, 3, "Cartão de débito", 983847889);
		
		utilitarioNotaFiscal utf = new utilitarioNotaFiscal();
		utf.imprimirNotaFiscal(produtos, notaFiscal, cliente);
		utf.imprimirProdutos(produtos);
		
	}

}
