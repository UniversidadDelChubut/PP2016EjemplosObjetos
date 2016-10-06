package practica1.barcos;

public class Barco {
	
	private int calado;
	private int eslora;
	private int manga;
	private String nombre;
	
	
	private double cargaMaxima = 100 ;
	private int velocidadCrucero = 30;
	
	private double cargaActual;
	private String ubicacion;
	private String puerto;
	
	
	public Barco(int calado,	int eslora,	int manga, 	String nombre){
		// Controlar
		this.calado = calado;
		this.eslora = eslora;
		this.manga = manga;
		this.nombre = nombre;
	}
	
	
	public Barco(int calado,	int eslora,	int manga, 	String nombre, double cargaMaxima, int velocidadCrucero){
		// Controlar
		this.calado = calado;
		this.eslora = eslora;
		this.manga = manga;
		this.nombre = nombre;
		this.cargaMaxima = cargaMaxima;
		this.velocidadCrucero = velocidadCrucero;
		
	}
	
	
	public int getCalado() {
		return calado;
	}

	public int getEslora(){
		return this.eslora;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getManga() {
		return manga;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public double getCargaActual() {
		return cargaActual;
	}

	public int getVelocidadCrucero() {
		return velocidadCrucero;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getPuerto() {
		return puerto;
	}
	
	
		
		
	
}
