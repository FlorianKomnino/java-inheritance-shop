package org.java.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int imeiCode;
	private int memorySize;
	
	Random rnd = new Random();
	
	public Smartphone(String nome, String marca, int prezzo, int memorySize) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub
		imeiCode = rnd.nextInt(1000000);
		this.memorySize = memorySize;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Smartphone nome: " + getNome() + 
				"/nmarca: " + getMarca() +
				"/nprezzo: " + getPriceWithTaxes() +
				"/ncodice prodotto: " + getPaddedCode();
	}

}
