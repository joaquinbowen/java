package krakedev.entidades;

public class Nota {
	//atributos
	private Materia materia;
	private double calificacion;
	
	//metodos
	public void mostrar() {
		System.out.println("Nota [Materia:" + this.materia.getNombre() + ", Calificacion:" + this.calificacion + "]");
	}

	
	//set and get
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}


	public Nota(Materia materia, double calificacion) {

		this.materia = materia;
		this.calificacion = calificacion;
	}
	
	
}
