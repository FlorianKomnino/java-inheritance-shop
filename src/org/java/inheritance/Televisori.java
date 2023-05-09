package org.java.inheritance;

public class Televisori extends Prodotto {
	private int heightSize;
	private int widthSize;
	private boolean isSmart;

	public Televisori(String nome, String marca, int prezzo, int heightSize, int widthSize, boolean isSmart) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub
		this.heightSize = heightSize;
		this.widthSize = widthSize;
		this.isSmart = isSmart;
	}

}
