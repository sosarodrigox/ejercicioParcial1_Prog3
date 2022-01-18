import java.util.ArrayList;
import java.util.List;

public class Catedra implements Comparable<Catedra>{

	int nroDeAula;
	String catedra;
	List <Alumno> listAlumnosCatedra= new ArrayList<Alumno>();
	
	
	public Catedra(int nroDeAula, String catedra) {
		this.nroDeAula = nroDeAula;
		this.catedra = catedra;
	}

	@Override
	public String toString() {
		return "Catedra: " + catedra + " " + "Nro de Aula: " + nroDeAula;
	}

	public int getNroDeAula() {
		return nroDeAula;
	}

	public void setNroDeAula(int nroDeAula) {
		this.nroDeAula = nroDeAula;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public List<Alumno> getListAlumnosCatedra() {
		return listAlumnosCatedra;
	}

	public void setListAlumnosCatedra(List<Alumno> listAlumnosCatedra) {
		this.listAlumnosCatedra = listAlumnosCatedra;
	}


	@Override
	public int compareTo(Catedra o) {
		// TODO Auto-generated method stub
		return this.getCatedra().compareTo(o.getCatedra()); //Compara según el nombre.
	}
	
	
	
	
}
