package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	// atributos
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	//contructors
	public Estudiante(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas=new ArrayList<Nota>();
	}
	public Estudiante() {
		this.notas=new ArrayList<Nota>();
	}
	

	// metodos
	public void agregarNota(Nota nuevaNota) {
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			boolean existeMateria = false;
			Materia elementoMateria = null;
			for (int i = 0; i < notas.size(); i++) {
				elementoMateria = notas.get(i).getMateria();
				if (nuevaNota.getMateria().getCodigo().equals(elementoMateria.getCodigo())) {
					existeMateria = true;
					break;
				}
			}
			if (existeMateria == false) {
				notas.add(nuevaNota);
			}

		}
	}



	public void modificarNota(String codigo, double nuevaNota) {
		//boolean notaValida = false;
		boolean existeMateria = false;
		Materia elementoMateria = null;
		if (nuevaNota <= 10 && nuevaNota >= 0) {
			//notaValida = true;
			for (int i = 0; i < notas.size(); i++) {
				elementoMateria = notas.get(i).getMateria();
				if (codigo.equals(elementoMateria.getCodigo())) {
					existeMateria = true;
					notas.get(i).setCalificacion(nuevaNota);
					break;
				}
			}
			if (!existeMateria) {
				System.out.println("No se encontro la materia con ese codigo :(");
			}

		} else {
			System.out.println("Nota invalida");
		}

	}

	public double calcularPromedioNotasEstudiante() {
		if (notas.size() != 0) {
			double suma = 0.00;
			Nota elementoNotas = null;
			for (int i = 0; i < notas.size(); i++) {
				elementoNotas = notas.get(i);
				suma += elementoNotas.getCalificacion();
			}
			return suma / notas.size();
		} else {
			return 0.00;
		}

	}

	public void mostrar() {
		System.out.println(
				"Estudiante [Nombre:" + this.nombre + ", Apellido:" + this.apellido + ", Cedula:" + this.cedula+"]");
		if (notas.size() != 0) {
			for (int i = 0; i < notas.size(); i++) {
				notas.get(i).mostrar();
			}
		}

	}
	
	

	// get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
