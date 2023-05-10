package org.java.inheritance;

public class Televisori extends Prodotto {
	private int heightSize;
	private int widthSize;
	private boolean isSmart;

	public Televisori(String nome, String marca, int prezzo, int heightSize, int widthSize, boolean isSmart) {
		super(nome, marca, prezzo);
		// TODO Auto-generated constructor stub
		setHeightSize(heightSize);
		setWidthSize(widthSize);
		setSmart(isSmart);
	}

	public int getHeightSize() {
		return heightSize;
	}

	public void setHeightSize(int heightSize) {
		this.heightSize = heightSize;
	}

	public int getWidthSize() {
		return widthSize;
	}

	public void setWidthSize(int widthSize) {
		this.widthSize = widthSize;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(TV)" + productInfos() +
				"\nheight size: " + getHeightSize() +
				"\nwidth size: " + getWidthSize() +
				"\nis smart: " + isSmart();
	}
}
