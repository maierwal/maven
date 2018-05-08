package de.walter;
import java.util.Scanner;
public class maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		
		String ausgabe;
		
		System.out.println("Geben Sie einen Text ein: ");
		ausgabe = eingabe.nextLine().toUpperCase();
		
		System.out.println("Ihr Text: "+ausgabe);
		// String zeicheneingabeformatiert = eingelesen.toUpperCase();

	}

}
