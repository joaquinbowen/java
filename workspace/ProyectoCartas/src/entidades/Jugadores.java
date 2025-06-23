package entidades;

import java.util.ArrayList;

import servicios.Juego;

public class Jugadores {
    private ArrayList<String> jugadores;

    public Jugadores() {
        this.jugadores = new ArrayList<>();
    }

    // get and set
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

  
    public void jugar() {

        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("Jugador 1");
        listaJugadores.add("Jugador 2");
        listaJugadores.add("Jugador 3");
        

        Juego juego = new Juego(listaJugadores);
        juego.entregarCartas(5);
        

        for(int i = 0; i < listaJugadores.size(); i++) {
            int total = calcularTotal(juego.getCartasJugadores().get(i));
            System.out.println("Jugador " + (i+1) + ": Total = " + total);
        }
        

        String ganador = determinarGanador(juego);
        System.out.println("El ganador es: " + ganador);
    }


    private int calcularTotal(ArrayList<Carta> cartas) {
        int total = 0;
        for(int i = 0; i < cartas.size(); i++) {
            total += cartas.get(i).getNumero().getValor();
        }
        return total;
    }


    private String determinarGanador(Juego juego) {
        ArrayList<ArrayList<Carta>> cartasJugadores = juego.getCartasJugadores();
        int maxPuntos = -1;
        String ganador = "";
        
        for(int i = 0; i < cartasJugadores.size(); i++) {
            int puntos = calcularTotal(cartasJugadores.get(i));
            if(puntos > maxPuntos) {
                maxPuntos = puntos;
                ganador = "Jugador " + (i+1);
            }
        }
        
        return ganador;
    }
}