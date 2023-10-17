package Herança3;

public class Principal {
		
		public static void main(String[] args) {
		Produto produto = new Produto(1, "1234", 3.000);
		System.out.println("Produto:");
		System.out.println("Id: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preco: " + produto.getPreco());

		Sorvete sorvete = new Sorvete(1, "1234", 3.000, 10);
		System.out.println("\nSorvete:");
		System.out.println("Id: " + sorvete.getId());
		System.out.println("Nome: " + sorvete.getNome());
		System.out.println("Preco: " + sorvete.getPreco());
		System.out.println("TempAdequada: " + sorvete.getTempAdequada());
	
		Camisa camisa = new Camisa(1, "1234", 3.000,"Branco","Algodão","1metro");
		System.out.println("\nCamisa:");
		System.out.println("Id: " + camisa.getId());
		System.out.println("Nome: " + camisa.getNome());
		System.out.println("Preco: " + camisa.getPreco());
		System.out.println("Cor: " + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: " + camisa.getTamanho());
		}
}
