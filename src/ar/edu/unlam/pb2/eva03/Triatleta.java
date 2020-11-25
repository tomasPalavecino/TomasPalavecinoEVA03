package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;

public class Triatleta extends Deportista{
	
	private String distaciaPreferida;
	private TipoDeBicicleta tria;

	public Triatleta(Integer numeroDeSocio, String nombre, String distaciaPreferida, TipoDeBicicleta tria) {
		super(numeroDeSocio,nombre);
		this.distaciaPreferida=distaciaPreferida;
		this.tria=tria;
	}

	public String getDistanciaPreferida() {
		return distaciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tria;
	}

}
