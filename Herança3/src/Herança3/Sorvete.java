package Herança3;

import Herança3.Produto;

public class Sorvete extends Produto {
	private double tempAdequada;
	
	public Sorvete(long id,String nome, double preco,double tempAdequada) {
		super(id, nome, preco);
		this.tempAdequada = tempAdequada;
		
}

	public double getTempAdequada() {
		return tempAdequada;
	}

	public void setTempAdequada(double tempAdequada) {
		this.tempAdequada = tempAdequada;
	}
}