package Modele;
// Generated 28-Jul-2018 13:51:06 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Depense generated by hbm2java
 */
@Entity
@Table(name = "depense", catalog = "lightstock")
public class Depense implements java.io.Serializable {

	private Integer idDepense;
	private double montant;
	private Date date;
	private String nom;
	private String description;
	private boolean ld;

	public Depense() {
	}

	public Depense(double montant, Date date, boolean ld) {
		this.montant = montant;
		this.date = date;
		this.ld = ld;
	}

	public Depense(double montant, Date date, String nom, String description, boolean ld) {
		this.montant = montant;
		this.date = date;
		this.nom = nom;
		this.description = description;
		this.ld = ld;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDepense", unique = true, nullable = false)
	public Integer getIdDepense() {
		return this.idDepense;
	}

	public void setIdDepense(Integer idDepense) {
		this.idDepense = idDepense;
	}

	@Column(name = "montant", nullable = false, precision = 22, scale = 0)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "nom")
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "description", length = 2048)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ld", nullable = false)
	public boolean isLd() {
		return this.ld;
	}

	public void setLd(boolean ld) {
		this.ld = ld;
	}

}
