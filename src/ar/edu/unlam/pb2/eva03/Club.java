package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {
	
	private String nombre;
	private Set<Deportista> socios = new HashSet<Deportista>();
	private Map<String,Evento> competencias = new HashMap<String,Evento>();

	public Club(String nombre) {
		this.nombre=nombre;
	}

	public void agregarDeportista(Deportista corredor) {
		socios.add(corredor);
		
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String evento) {
		competencias.put(evento, new Evento(tipo));
	}

	public Integer inscribirEnEvento(String nombre, Deportista deportista)throws NoEstaPreparado{
		Integer inscripciones=0;
		Evento deseado = competencias.get(nombre);
		switch(deseado.getTipo()) {
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			if(deportista instanceof Corredor) {
			inscripciones = deseado.agregarParticipante(deportista);
		break;
			}
		}
		return inscripciones;
	}
	

	public Boolean buscarDeportista(Deportista deportista) {
		Boolean verificar = false;
		for (Deportista d : socios) {
			if (deportista.getNumeroDeSocio().equals(d.getNumeroDeSocio())) {
				verificar = true;
			}
		}
		return verificar;
	}
	
	
}
