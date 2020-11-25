package ar.edu.unlam.pb2.eva03;

public class Nadador extends Deportista{
	
	private String estilo;

	public Nadador(Integer numeroDeSocio, String nombre, String estilo) {
		super(numeroDeSocio,nombre);
		this.estilo=estilo;
	}

	public String getEstiloPreferido() {
		return estilo;
	}

}
