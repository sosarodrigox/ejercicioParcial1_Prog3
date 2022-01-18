
public class Alumno {

	int dNI;
	String nombre;
	String apellido;	

	public Alumno(int dNI, String nombre, String apellido) {
		super();
		this.dNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
	} 

	@Override
	public String toString() {
		return "Alumno :" + apellido +", "+ nombre +" - "+ "DNI: " + dNI;
	}

	public int getdNI() {
		return dNI;
	}

	public void setdNI(int dNI) {
		this.dNI = dNI;
	}

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
}
