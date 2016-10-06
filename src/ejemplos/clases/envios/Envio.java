package ejemplos.clases.envios;

import java.util.Date;

public class Envio {
	
	private static int siguienteNumero = 1;
	
	public static final int ENVIO_PENDIENTE = 1;
	public static final int ENVIADO = 2;
	public static final int ENTREGADO = 3;
	

	private String origen;
	private String destino;
	private float peso;
	private int tamanio;
	private Date fechaEntrega;
	private int numero;
	private int estado;
	private Repartidor repartidor;
	private Bicicleta bicicleta;

	
	public Envio(String origen, String destino, float peso, int tamanio) {
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
		this.tamanio = tamanio;
		this.numero = siguienteNumero++;
		this.estado = ENVIO_PENDIENTE;
	}
	
	
	public void asignarParaEnvio(Repartidor repartidor, Bicicleta bicicleta) {
		
		if (repartidor == null || bicicleta ==null) {
			return;
		}
		
		this.repartidor = repartidor;
		this.bicicleta = bicicleta;
		this.estado = ENVIADO;
	}
	
	
	public void entregar() {
		this.fechaEntrega = new Date();
		this.estado = ENTREGADO;
	}
	
	
	
	public float getPeso() {
		return peso;
	}
	
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public int getTamanio() {
		return tamanio;
	}

	public int getNumero() {
		return numero;
	}

	public int getEstado() {
		return estado;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}
	
	
}
