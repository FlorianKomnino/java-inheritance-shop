package org.java.inheritance;

public class Cuffie extends Prodotto {
	private String color;
	private boolean isWireless;

	public Cuffie(String nome, String marca, int prezzo, String color, boolean isWireless) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.isWireless = isWireless;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cuffia nome: " + getNome() + 
				"/nmarca: " + getMarca() +
				"/nprezzo: " + getPriceWithTaxes() +
				"/ncodice prodotto: " + getPaddedCode();
	}
}
