package entidades;

public class Carta {
	//atributos
	private Numero numero;
	private String palo;
	private String estado = "N";
	
	//constructor
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	//metodos
	public void mostrar() {
		System.out.println(this.numero+"-"+this.palo);
	}
	
	
	
	
	
	//set and get
	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
