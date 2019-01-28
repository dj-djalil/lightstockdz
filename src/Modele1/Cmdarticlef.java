package Modele1;
// Generated 28-Jul-2018 13:51:06 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cmdarticlef generated by hbm2java
 */
@Entity
@Table(name = "cmdarticlef", catalog = "lightstock")
public class Cmdarticlef implements java.io.Serializable {

	private Integer idCmdarticleF;
	private Article article;
	private Cmdf cmdf;
	private double qte;
	private double prixAchat;
	private double prixVente;
	private int ordre;

	public Cmdarticlef() {
	}

	public Cmdarticlef(Article article, Cmdf cmdf, double qte, double prixAchat, double prixVente, int ordre) {
		this.article = article;
		this.cmdf = cmdf;
		this.qte = qte;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.ordre = ordre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCmdarticleF", unique = true, nullable = false)
	public Integer getIdCmdarticleF() {
		return this.idCmdarticleF;
	}

	public void setIdCmdarticleF(Integer idCmdarticleF) {
		this.idCmdarticleF = idCmdarticleF;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idArticle", nullable = false)
	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCmdF", nullable = false)
	public Cmdf getCmdf() {
		return this.cmdf;
	}

	public void setCmdf(Cmdf cmdf) {
		this.cmdf = cmdf;
	}

	@Column(name = "qte", nullable = false, precision = 22, scale = 0)
	public double getQte() {
		return this.qte;
	}

	public void setQte(double qte) {
		this.qte = qte;
	}

	@Column(name = "prixAchat", nullable = false, precision = 22, scale = 0)
	public double getPrixAchat() {
		return this.prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Column(name = "prixVente", nullable = false, precision = 22, scale = 0)
	public double getPrixVente() {
		return this.prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

	@Column(name = "ordre", nullable = false)
	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}