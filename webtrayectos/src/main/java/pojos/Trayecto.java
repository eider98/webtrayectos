package pojos;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Trayecto {

	private Long id;
	private LocalDateTime salida;
	private LocalDateTime llegada;
	private String ruta;
	private String direccion;
	private String duration;
	private String observaciones;
	
	//CONSTRUCTORES
	public Trayecto(Long id, String salida, String llegada, String ruta, String direccion, String duration, String observaciones) {
		this.id = id;
		this.salida = LocalDateTime.parse(salida);
		this.llegada = LocalDateTime.parse(llegada);
		this.ruta = ruta;
		this.direccion = direccion;
		this.duration = Duration.between(getSalida(), getLlegada()).toSeconds()+"";
		if (observaciones==null) {
			this.observaciones = "";
		}else {
			this.observaciones = observaciones;
		}
		
	}
	
	public Trayecto(Long id, String salida, String llegada, String ruta, String direccion, String observaciones) {
		this(id, salida, llegada, ruta, direccion, null,observaciones);
	}
	
	public Trayecto(String salida, String llegada, String ruta, String direccion, String observaciones) {
		this(null, salida, llegada, ruta, direccion, null,observaciones);
	}
	
	public Trayecto(String salida, String llegada, String ruta, String direccion) {
		this(null, salida, llegada, ruta, direccion, null,null);
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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//Duration in seconds
	public String getDuration() {
		return duration;
	}
	
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	//Formated duration MM:SS
	public String getDurationFormated() {
		long sec = Long.parseLong(duration);
		 // Calculate minutes and remaining seconds
        long minutes = sec / 60;
        long seconds = sec % 60;
        String formattedTime = String.format("%02d:%02d", minutes, seconds);
		return formattedTime;
	}
	
	public LocalDate getFecha() {
		LocalDate fecha = this.salida.toLocalDate();
		return fecha;
	}
	

	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", salida=" + salida + ", llegada=" + llegada + ", ruta=" + ruta + ", direccion="
				+ direccion + ", duration=" + duration + "]";
	}


	

	
	
}
