package entidades;

import java.util.ArrayList;

public class Naipe {
	// atributos
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	// constructor
	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();

		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		Palos palos = new Palos();

		ArrayList<String> listaPalos = new ArrayList<String>();
		listaPalos.add(palos.getCorazonNegro());
		listaPalos.add(palos.getCorazonRojo());
		listaPalos.add(palos.getDiamante());
		listaPalos.add(palos.getTrebol());

		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero numeroActual = numerosPosibles.get(i);

			for (int j = 0; j < listaPalos.size(); j++) {
				cartas.add(new Carta(numeroActual, listaPalos.get(j)));
			}
		}

	}

	// metodos

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			int posicion = Random.obtenerPosicion();
			Carta carta = cartas.get(posicion);

			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int i = 0; i < cartas.size(); i++) {
			Carta carta = cartas.get(i);
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int i = 0; i < cartas.size(); i++) {
			cartas.get(i).setEstado("N");
		}

		return auxiliar;
	}

	// get
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

}
