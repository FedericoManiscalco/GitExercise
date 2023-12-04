package main;

import com.calcolatrice.MetodoSomma;
import com.calcolatrice.Moltiplicazione;
import com.calcolatrice.Variabili;

public class Main {
	public static void main(String[] args) {
		System.out.println("ciao bruthers");
		System.out.println("Sono Angelo");
		System.out.println("oleeee");

		double valore;

		Variabili variabili = new Variabili(6, 18);
		MetodoSomma somma1 = new MetodoSomma();
		Moltiplicazione prodotto = new Moltiplicazione();

		valore = somma1.somma(variabili);

		System.out.println(valore);

		valore = prodotto.Prodotto(variabili);

		System.out.println(valore);

	}
}
