package pojos;

import java.time.LocalDateTime;

public class Trayecto {

	private Long id;
	private LocalDateTime salida;
	private LocalDateTime llegada;
	private String ruta;
	private String direccion;
	
	//CONSTRUCTORES
	public Trayecto(Long id, String salida, String llegada, String ruta, String direccion) {
		this.id = id;
		this.salida = LocalDateTime.parse(salida);
		this.llegada = LocalDateTime.parse(llegada);
		this.ruta = ruta;
		this.direccion = direccion;
	}
	
	public Trayecto(String salida, String llegada, String ruta, String direccion) {
		this(null, salida, llegada, ruta, direccion);
	}
	
	//GETTERS Y SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getSalida() {
		return salida;
	}

	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", salida=" + salida + ", llegada=" + llegada + ", ruta=" + ruta + ", direccion="
				+ direccion + "]";
	}

	
	
}
