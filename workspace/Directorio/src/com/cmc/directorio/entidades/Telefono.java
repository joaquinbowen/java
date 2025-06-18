package com.cmc.directorio.entidades;

public class Telefono {
	//atributos
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;
	//constructores
	public Telefono(String operadora,String numero,int codigo) {
		this.codigo=codigo;
		this.numero=numero;
		this.operadora=operadora;
		this.tieneWhatsapp=false;
	}
	//metodos
	public void imprimir() {
		System.out.println("Operadora: "+operadora);
		System.out.println("Numero: "+numero);
		System.out.println("Codigo: "+codigo);
		System.out.println("Tiene Whatsapp: "+tieneWhatsapp);
	}
	
	
	
	
	
	
	//get and set
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}
	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	
	
	
	
	}
