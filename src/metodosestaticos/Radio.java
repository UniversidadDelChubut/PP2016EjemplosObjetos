package metodosestaticos;

public class Radio {
	
	private static int siguienteNumeroSerie = 1;
	
	public static final int VOLUMEN_MAXIMO = 10;
	public static final int VOLUMEN_MINIMO =  0;
	
	
	static {
		//TOmar de archivo
	}
	
	private int numeroSerie;
	private int volumen = 0;
	private double frecuencia = 89.1;
	
	public static int CantidadDeRadiosCreadas(){
		return siguienteNumeroSerie - 1;
	}
	
	public Radio() {
		this.numeroSerie = Radio.siguienteNumeroSerie++;
		//Actualizaria del archivo
	}
	
	
	
	@Override
	public String toString() {
		return "Serie: " +  this.numeroSerie + "  Volumen: " + this.volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public double getFrecuencia() {
		return frecuencia;
	}
	
	
	public void subirVolumen() {
		if (this.volumen < 10) {
			this.volumen++;
		}
	}
	
	public void subirVolumen(int volumen) {
		if (volumen > VOLUMEN_MAXIMO) {
			this.volumen = VOLUMEN_MAXIMO;
		} else if (volumen < VOLUMEN_MINIMO ) {
			this.volumen = VOLUMEN_MINIMO;
		} else {
			this.volumen = volumen;
		}
	}
}
