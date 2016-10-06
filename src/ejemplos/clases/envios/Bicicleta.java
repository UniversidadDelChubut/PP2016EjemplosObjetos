package ejemplos.clases.envios;

public class Bicicleta {
	private int numero;
	private String tipo;
	
	public Bicicleta(int numero, String tipo) {
		this.tipo = tipo;
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getTipo() {
		return tipo;
	}
	
}
