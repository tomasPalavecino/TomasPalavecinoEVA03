package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista{
	
	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio,nombre);
		this.distanciaPreferida=distanciaPreferida;
	}
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida, Integer cantidadDeKilometrosEntrenados) {
		super(numeroDeSocio,nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.cantidadDeKilometrosEntrenados=cantidadDeKilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	
	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	

}
