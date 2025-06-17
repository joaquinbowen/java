package clearminds.cuentas;

public class Cuentas {
	// encapsulados
	private String id;
	private String tipo;
	private double saldo;
	
	//constructores
	public Cuentas(String id) {
		this.id=id;
		this.tipo = "A";
	}
	
	public Cuentas(String id,String tipo,double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	//metodos
	public void imprimir() {
		System.out.println("*******************");
		System.out.println("Cuenta");
		System.out.println("*******************");
		System.out.println("Numero de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD"+saldo);
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("--------------");
		System.out.println("CUENTA");
		System.out.println("# de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo+"$");
		System.out.println("--------------");
	}
	
	
	
	
	
	
	

	// get y set
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

}
