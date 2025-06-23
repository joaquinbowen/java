package servicios;

import entidades.Carta;
import entidades.Naipe;
import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;

    public Juego(ArrayList<String> idsJugadores) {
        this.naipe = new Naipe();
        this.naipeBarajado = this.naipe.barajar();
        this.cartasJugadores = new ArrayList<>();
        
        for(int i = 0; i < idsJugadores.size(); i++) {
            this.cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    public int devolverTotal(int indexJugador) {
        if(indexJugador < 0 || indexJugador >= cartasJugadores.size()) {
            return 0;
        }
        
        int total = 0;
        ArrayList<Carta> cartas = cartasJugadores.get(indexJugador);
        
        for(int i = 0; i < cartas.size(); i++) {
            total += cartas.get(i).getNumero().getValor();
        }
        
        return total;
    }

    public String determinarGanador() {
        if(cartasJugadores.isEmpty()) return "No hay jugadores";
        
        int indexGanador = 0;
        int sumaGanador = devolverTotal(0);
        
        for(int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            
            if(sumaActual > sumaGanador) {
                sumaGanador = sumaActual;
                indexGanador = i;
            }
        }
        
        return "jugador " + (indexGanador + 1);
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void entregarCartas(int cartasPorJugador) {
        int totalJugadores = cartasJugadores.size();
        int cartaActual = 0;
        
        for(int i = 0; i < cartasPorJugador; i++) {
            for(int j = 0; j < totalJugadores; j++) {
                if(cartaActual < naipeBarajado.size()) {
                    Carta carta = naipeBarajado.get(cartaActual);
                    cartasJugadores.get(j).add(carta);
                    cartaActual++;
                }
            }
        }
    }
}