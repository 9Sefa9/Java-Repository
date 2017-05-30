

import java.lang.Exception;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
/*Diese Klasse beinhaltet alle informationen, die man braucht, um die Klausur GPT zu bestehen
 * es werden ausschließlich im bereich der Objekt-Orientierung programmiert. Suche im google
 * nach visuellen beispielen über UML, Interfaces und abstrakte Klassen. */
//primitive/referenz-Datentypen
//Überladen/Überschreiben von Methoden, Konstruktoren
//Rekursion/Iteration
//Streams & Generics 
//Unchecked/checked  Exceptions 
//try-Catch-throw bzw. try-resource und finally  
//Interface/abstrakte Klassen
//schleifen/Bedingungen
//Arrays und wichtige Methoden
//super-funktion

public class TheMainClass extends TheAbstract implements TheInterface {

	// primitive Datentypen
	public int i32 = 32;
	public float f32;
	public long l64;
	public double d64 = 64;
	public short s16;
	public byte b8;
	public boolean b = true;
	// Referenz Datentypen+Arrays
	public String s;
	public char c;
	public int[] MainArray = new int[interfaceMethodArray().length];

	public TheMainClass(String s) {
		super(s);
		this.s = s;
	}

	public TheMainClass(int[] array) {
		super(array);
		this.MainArray = array;
	}
	public static void main(String[] args) {
		//TheAbstract abstraktclass = new TheAbstract("test"); nicht möglich
		//TheInterface inter = nsew TheInterface(); nicht möglich
		TheMainClass tmc = new TheMainClass("s");
		System.out.println(tmc);
	}
	public int interfaceMethod(int zahl1, int zahl2) {
		return zahl1+zahl2;
	}
	public int[] interfaceMethodArray() {
		int[] iarray = { 2, 4, 6, 8, 10 };
		return iarray;
	}
	public String iterate(int[] array){
		String s = "";
		for(int i:array)
			s+=i+",";
		return s;
	}
	public int abstractMethod(String s){
		s = ""+i32;
		return Integer.parseInt(s);
	}

	public String toString() {
		return "Die Main Klasse hat den String "+s+"\nDie interface Methode hat das ergebnis: "+interfaceMethod(i32, i32)+"\nDer interface Array beinhaltet folgende Werte: "+iterate(interfaceMethodArray())+",\nDie Abstrakte Methode hat wen wert: "+abstractMethod("");
	}

}
