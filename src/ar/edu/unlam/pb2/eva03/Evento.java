package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion=0;
		participantes = new TreeMap<>();
	}
	
	public Integer agregarParticipante(Deportista deportista) {
		participantes.put(numeroDeInscripcion++,deportista);
		return participantes.size();
	}

	public TipoDeEvento getTipo() {
		return this.tipo;
	}
	
}
