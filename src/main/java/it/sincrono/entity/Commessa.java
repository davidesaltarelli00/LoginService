package it.sincrono.entity;

import java.util.Date;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "commessa")
public class Commessa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_tipo_azienda_cliente")
	private TipoAziendaCliente tipoAziendaCliente;

	@Column(name = "cliente_finale")
	private String clienteFinale;

	@Column(name = "titolo_posizione")
	private String titoloPosizione;

	@Column(name = "distacco")
	private Boolean distacco;

	@Column(name = "distacco_azienda")
	private String distaccoAzienda;

	@Column(name = "distacco_data")
	private Date distaccoData;

	@Column(name = "data_inizio")
	private Date dataInizio;

	@Column(name = "data_fine")
	private Date dataFine;

	@Column(name = "tariffa_giornaliera")
	private String tariffaGiornaliera;

	@Column(name = "azienda_di_fatturazione_interna")
	private String aziendaDiFatturazioneInterna;

	@Column(name = "attivo")
	private Boolean attivo;
	
	@Transient
    private  String nome;
	
	@Transient
    private  String cognome;

	

	public Commessa(Integer id, TipoAziendaCliente tipoAziendaCliente, String clienteFinale, String titoloPosizione,
			Boolean distacco, String distaccoAzienda, Date distaccoData, Date dataInizio, Date dataFine,
			String tariffaGiornaliera, String aziendaDiFatturazioneInterna, Boolean attivo, String nome,
			String cognome) {
		super();
		this.id = id;
		this.tipoAziendaCliente = tipoAziendaCliente;
		this.clienteFinale = clienteFinale;
		this.titoloPosizione = titoloPosizione;
		this.distacco = distacco;
		this.distaccoAzienda = distaccoAzienda;
		this.distaccoData = distaccoData;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.tariffaGiornaliera = tariffaGiornaliera;
		this.aziendaDiFatturazioneInterna = aziendaDiFatturazioneInterna;
		this.attivo = attivo;
		this.nome = nome;
		this.cognome = cognome;
	}



	public Commessa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commessa(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoAziendaCliente getTipoAziendaCliente() {
		return tipoAziendaCliente;
	}

	public void setTipoAziendaCliente(TipoAziendaCliente tipoAziendaCliente) {
		this.tipoAziendaCliente = tipoAziendaCliente;
	}

	public String getClienteFinale() {
		return clienteFinale;
	}

	public void setClienteFinale(String clienteFinale) {
		this.clienteFinale = clienteFinale;
	}

	public String getTitoloPosizione() {
		return titoloPosizione;
	}

	public void setTitoloPosizione(String titoloPosizione) {
		this.titoloPosizione = titoloPosizione;
	}

	public Boolean getDistacco() {
		return distacco;
	}

	public void setDistacco(Boolean distacco) {
		this.distacco = distacco;
	}

	public String getDistaccoAzienda() {
		return distaccoAzienda;
	}

	public void setDistaccoAzienda(String distaccoAzienda) {
		this.distaccoAzienda = distaccoAzienda;
	}

	public Date getDistaccoData() {
		return distaccoData;
	}

	public void setDistaccoData(Date distaccoData) {
		this.distaccoData = distaccoData;
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

	public String getTariffaGiornaliera() {
		return tariffaGiornaliera;
	}

	public void setTariffaGiornaliera(String tariffaGiornaliera) {
		this.tariffaGiornaliera = tariffaGiornaliera;
	}

	public String getAziendaDiFatturazioneInterna() {
		return aziendaDiFatturazioneInterna;
	}

	public void setAziendaDiFatturazioneInterna(String aziendaDiFatturazioneInterna) {
		this.aziendaDiFatturazioneInterna = aziendaDiFatturazioneInterna;
	}

	public Boolean getAttivo() {
		return attivo;
	}

	public void setAttivo(Boolean attivo) {
		this.attivo = attivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	

}
