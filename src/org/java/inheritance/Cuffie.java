package org.java.inheritance;

public class Cuffie extends Prodotto {
	private String color;
	private boolean isWireless;

	public Cuffie(String nome, String marca, int prezzo, String color, boolean isWireless) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub

	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(H)" + productInfos() +
				"/ncolor: " + getColor() +
				"/nis wireless: " + isWireless();
	}
}
