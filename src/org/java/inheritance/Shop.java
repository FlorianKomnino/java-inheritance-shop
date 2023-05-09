package org.java.inheritance;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {		
			System.out.println("Digita il numero relativo all'azione che vuoi compiere:");
			System.out.println("1 - crea un prodotto - Smartphone");
			System.out.println("2 - crea un prodotto - Televisore");
			System.out.println("3 - crea un prodotto - Cuffia");
			System.out.println("4 - esci dal programma");
			
			int userChoice = sc.nextInt();
			
			if (userChoice < 1 || userChoice > 5) {
				
				System.err.println("Scelta non trovata");
				
				continue;
			}
			
			switch (userChoice) {
			case 1: {
				System.out.println("inserisci il nome del tuo smartphone");
				String prodName = sc.nextLine();
				System.out.println("inserisci la marca del tuo smartphone");
				String brandName = sc.nextLine();
				System.out.println("inserisci il prezzo in euro del tuo smartphone");
				float price = sc.nextFloat();
				int convertedPrice = (int) (price * 100);
				System.out.println("inserisci la quantita' di memoria del tuo smartphone");
				int memory = sc.nextInt();
				
				Smartphone newSmartphone = new Smartphone(prodName, brandName, convertedPrice, memory);
				
				System.out.println("Il tuo smartphone e' stato creato con successo.");
				System.out.println(newSmartphone);
			}
			break;
			case 2: {
				System.out.println("inserisci il nome del tuo televisore");
				String prodName = sc.nextLine();
				System.out.println("inserisci la marca del tuo televisore");
				String brandName = sc.nextLine();
				System.out.println("inserisci il prezzo in euro del tuo televisore");
				float price = sc.nextFloat();
				int convertedPrice = (int) (price * 100);

				System.out.println("inserisci l'altezza del tuo televisore in centimetri");
				int height = sc.nextInt();
				if (height < 10) {
					System.err.println("dimensione non valida");
					continue;
				}
				System.out.println("inserisci la larghezza del tuo televisore in centimetri");
				int width = sc.nextInt();
				if (width < 10) {
					System.err.println("dimensione non valida");
					continue;
				}

				System.out.println("il tuo televisore e' smart?");
				System.out.println("1 - si");
				System.out.println("2 - no");
				int isSmart = sc.nextInt();
				if (isSmart < 1 || isSmart > 2) {
					System.err.println("Scelta non trovata");
					continue;
				}
				boolean tvIsSmart = isSmart == 1 ? true : false;

				
				Televisori newTelevision = new Televisori(prodName, brandName, convertedPrice, height, width, tvIsSmart);
				
				System.out.println("Il tuo smartphone e' stato creato con successo.");
				System.out.println(newTelevision);
			}
			break;
				
				
			}
		}
		
	}
}
