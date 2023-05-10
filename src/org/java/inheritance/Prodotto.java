package org.java.inheritance;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	Random rnd = new Random();
	
	public Prodotto(String nome, String marca, int prezzo) {
		this.codice = rnd.nextInt(100001);
		setMarca(marca);
		setNome(nome);
		setPrezzo(prezzo);
		this.iva = 22;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getCodice() {
		return codice;
	}
	public int getPriceWithTaxes() {
		return (int) (getPrezzo() * (1 + getIva() / 100f));
	}
	
	public String getPaddedCode() {
		
		String strCode = "" + codice;
		int strLng = strCode.length();
		
		for (int x=0;x<8-strLng;x++) {
			strCode = "0" + strCode;
		}
		return strCode;
	}
	
	public String productInfos() {
		return "nome: " + getNome() + 
				"\nmarca: " + getMarca() +
				"\nprezzo: " + getPriceWithTaxes() +
				"\ncodice prodotto: " + getPaddedCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(P) " + productInfos();
	}
	
	
}
