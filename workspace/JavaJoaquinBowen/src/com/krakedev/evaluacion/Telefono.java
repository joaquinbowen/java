package com.krakedev.evaluacion;

public class Telefono {
	//atributos
	private String numero;
	private String tipo;
	private String estado;
	
	//constructores
	public Telefono(String numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;
		boolean hayError=false;
		if(numero ==null || tipo ==null) {
			hayError=true;
			this.estado="E";
		}
		if(!hayError && (tipo.equals("Movil") || tipo.equals("Convencional"))) {
			if((tipo.equals("Convencional") && numero.length()==7) || (tipo.equals("Movil") && numero.length()==10)) {
				this.estado="C";
			}else {
				this.estado="E";
			}
		}else {
			this.estado="E";
		}
	}
	
	
	
	
	//getters
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	

}
