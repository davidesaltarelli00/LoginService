package it.sincrono.services.costants;

public enum ServiceMessages {

	ERRORE_GENERICO(-1), ERRORE_INTEGRITA_DATI(-2), RECORD_NON_TROVATO(-3), RECORD_ESISTENTE(-4),
	ERRORE_VALIDAZIONE(-5), ERRORE_FIGLI(-6), NON_AUTORIZZATO(-7), CREDENZIALI_ERRATE(-8), UTENTE_DISATTIVATO(-9);

	private Integer code;

	public int getCode() {
		return code;
	}

	private ServiceMessages(Integer code) {
		this.code = code;

	}
}
