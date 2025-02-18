package it.sincrono.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profili")
public class Profilo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_ruolo")
	private Ruolo ruolo;

	@ManyToOne
	@JoinColumn(name = "id_utente")
	private Utente utente;

	@Column(name = "data_inizio")
	private Date dataInizio;

	@Column(name = "data_fine")
	private Date dataFine;

	@Column(name = "data_aggiornamento")
	private Date dataAggiornamento;

	@Column(name = "utente_aggiornamento")
	private String utenteAggiornamento;

	public Profilo(Integer id, Ruolo ruolo, Utente utente, Date dataInizio, Date dataFine, Date dataAggiornamento,
			String utenteAggiornamento) {
		super();
		this.id = id;
		this.ruolo = ruolo;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.dataAggiornamento = dataAggiornamento;
		this.utenteAggiornamento = utenteAggiornamento;
	}

	public Profilo(Integer id, Ruolo ruolo, Utente utente, Date dataInizio, Date dataFine, String utenteAggiornamento) {
		super();
		this.id = id;
		this.ruolo = ruolo;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.utenteAggiornamento = utenteAggiornamento;
	}

	public Profilo(Utente utente, Ruolo ruolo, Date dataInizio, Date dataFine, String utenteAggiornamento) {
		super();
		this.ruolo = ruolo;
		this.utente = utente;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.utenteAggiornamento = utenteAggiornamento;
	}
	
	

	public Profilo(Ruolo ruolo, Utente utente) {
		super();
		this.ruolo = ruolo;
		this.utente = utente;
	}
	
	
	

	

	public Profilo(Integer id, Ruolo ruolo, Utente utente) {
		super();
		this.id = id;
		this.ruolo = ruolo;
		this.utente = utente;
	}

	public Profilo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	public String getUtenteAggiornamento() {
		return utenteAggiornamento;
	}

	public void setUtenteAggiornamento(String utenteAggiornamento) {
		this.utenteAggiornamento = utenteAggiornamento;
	}

}
