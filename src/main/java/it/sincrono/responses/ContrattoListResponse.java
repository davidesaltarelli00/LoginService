package it.sincrono.responses;

import java.util.List;

import it.sincrono.beans.Esito;
import it.sincrono.entity.Contratto;

public class ContrattoListResponse extends GenericResponse {

	private List<Contratto> list;

	public ContrattoListResponse(Esito esito, List<Contratto> list) {
		super(esito);
		this.list = list;
	}

	public ContrattoListResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContrattoListResponse(Esito esito) {
		super(esito);
		// TODO Auto-generated constructor stub
	}

	public List<Contratto> getList() {
		return list;
	}

	public void setList(List<Contratto> list) {
		this.list = list;
	}

}
