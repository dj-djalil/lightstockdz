package Modele;
// Generated 9 juil. 2018 19:48:23 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * Cmd generated by hbm2java
 */
@Entity
@Table(name = "cmd", catalog = "lightstock")
public class Cmd implements java.io.Serializable {

	private Integer idCmd;
	private Client client;
	private Utilisateur utilisateur;
	private Date date;
	private double totalCmd;
	private double totalRemise;
	private double versement;
	private boolean ld;
	private Set<Cmdarticle> cmdarticles = new HashSet<Cmdarticle>(0);

	public Cmd() {
		date = new Date();
		totalCmd=0;
		totalRemise=0;
		versement=0;
		
	}

	public Cmd(double totalCmd, boolean ld) {
		this.totalCmd = totalCmd;
		this.ld = ld;
	}

	public Cmd(Client client, Utilisateur utilisateur, Date date, double totalCmd, Double totalRemise, boolean ld,
			Set<Cmdarticle> cmdarticles) {
		this.client = client;
		this.utilisateur = utilisateur;
		this.date = date;
		this.totalCmd = totalCmd;
		this.totalRemise = totalRemise;
		this.ld = ld;
		this.cmdarticles = cmdarticles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCmd", unique = true, nullable = false)
	public Integer getIdCmd() {
		return this.idCmd;
	}

	public void setIdCmd(Integer idCmd) {
		this.idCmd = idCmd;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "idClient")
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtilisateur")
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "totalCmd", nullable = false, precision = 22, scale = 0)
	public double getTotalCmd() {
		return this.totalCmd;
	}

	public void setTotalCmd(double totalCmd) {
		this.totalCmd = totalCmd;
	}

	@Column(name = "totalRemise", nullable = false, precision = 22, scale = 0)
	public double getTotalRemise() {
		return this.totalRemise;
	}

	public void setTotalRemise(double totalRemise) {
		this.totalRemise = totalRemise;
	}
	@Column(name = "versement", nullable = false, precision = 22, scale = 0)
	public double getVersement() {
		return this.versement;
	}

	public void setVersement(double versement) {
		this.versement = versement;
	}

	@Column(name = "ld", nullable = false)
	public boolean isLd() {
		return this.ld;
	}

	public void setLd(boolean ld) {
		this.ld = ld;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "cmd", orphanRemoval=true)
	public Set<Cmdarticle> getCmdarticles() {
		return this.cmdarticles;
	}

	public void setCmdarticles(Set<Cmdarticle> cmdarticles) {
		this.cmdarticles = cmdarticles;
	}

	@Transient
	public String getNomClient() {
		try {
			return getClient().getRaisonSociale();
		} catch (Exception e) {
			return "زبون";
		}
	}

}