package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	// atributo
	private ArrayList<Estudiante> estudiantes;

	// metodos
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		Estudiante estudianteEncontrado = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				estudianteEncontrado = elementoEstudiante;
				break;
			}
		}
		return estudianteEncontrado;
	}

	public Curso() {
		this.estudiantes=new ArrayList<Estudiante>();
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		Estudiante estudianteEncontrado = this.buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado!=null) {
			//aaaaaa
		}else {
			this.estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double suma=0.00;
		for(int i =0;i<estudiantes.size();i++) {
			suma+=estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		return suma/estudiantes.size();
	}
	
	public void mostrar() {
		for (int i=0;i<estudiantes.size();i++) {
			estudiantes.get(i).mostrar();
		}
	}

	// get and set
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
}
