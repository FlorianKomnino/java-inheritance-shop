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
	

	public int getImeiCode() {
		return imeiCode;
	}

	public void setImeiCode(int imeiCode) {
		this.imeiCode = imeiCode;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(S)" + productInfos() +
				"\nimei code: " + getImeiCode() +
				"\nmemory size: " + getMemorySize();
	}
}
