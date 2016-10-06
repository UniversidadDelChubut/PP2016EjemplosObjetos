package ejemplos.clases.envios;

public class Repartidor {
	
	private String nombre;
	private String sexo;
	
	public Repartidor(String nombre, String sexo) {
		this.nombre = nombre;
		if (sexo.toUpperCase().equals("M") || sexo.toUpperCase().equals("F")){
			this.sexo = sexo.toUpperCase();
		}  else {
			this.sexo = "M";
		}
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
