package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BENVENUTO SU PASSWORD GENERATOR");
		
		System.out.print("Inserisci il tuo nome: ");
		String userName = sc.nextLine().trim().toLowerCase();
		
		System.out.print("Inserisci il tuo cognome: ");
		String userLastname = sc.nextLine().trim().toLowerCase();
		
		System.out.print("Qual è il tuo colore preferito? ");
		String favColor = sc.nextLine().trim().toLowerCase();
		
		System.out.print("Qual è la tua data di nascita? ");
		String doB = sc.nextLine();
		String[] splitDoB = doB.split("[-/]");
		int day = Integer.parseInt(splitDoB[0]);
		int month = Integer.parseInt(splitDoB[1]);
		int year = Integer.parseInt(splitDoB[2]);
		int sumDoB = day + month + year;
		
		String password = userName + '-' + userLastname + '-' + favColor + '-' + sumDoB;
		System.out.println("La tua password è: " + password);
	}

}
