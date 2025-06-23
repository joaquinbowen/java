package entidades;

public class Numero {
	// atributos
	private String numeroCarta;
	private int valor;

	// contructores
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	
	//metodos
	public void mostrar() {
		System.out.println(this.numeroCarta+"-"+this.valor);
	}

	// get and set
	public String getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
