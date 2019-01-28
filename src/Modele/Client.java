package Modele;
// Generated 8 juil. 2018 03:27:56 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Client generated by hbm2java
 */
@Entity
@Table(name = "client", catalog = "lightstock")
public class Client implements java.io.Serializable {

	private Integer idClient;
	private String nomAr;
	private String prenomAr;
	private String raisonSociale;
	private String email;
	private String username;
	private String password;
	private String imageUrl;
	private Integer sexe;
	private String tel;
	private String fixe;
	private Date dt;
	private boolean ld;
	private Set<Cmd> cmds = new HashSet<Cmd>(0);

	public Client() {
	}

	public Client(boolean ld) {
		this.ld = ld;
	}

	public Client(String nomAr, String prenomAr, String raisonSociale, String email, String username, String password,
			String imageUrl, Integer sexe, String tel, String fixe, Date dt, boolean ld, Set<Cmd> cmds) {
		this.nomAr = nomAr;
		this.prenomAr = prenomAr;
		this.raisonSociale = raisonSociale;
		this.email = email;
		this.username = username;
		this.password = password;
		this.imageUrl = imageUrl;
		this.sexe = sexe;
		this.tel = tel;
		this.fixe = fixe;
		this.dt = dt;
		this.ld = ld;
		this.cmds = cmds;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idClient", unique = true, nullable = false)
	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	@Column(name = "nomAr")
	public String getNomAr() {
		return this.nomAr;
	}

	public void setNomAr(String nomAr) {
		this.nomAr = nomAr;
	}

	@Column(name = "PrenomAr")
	public String getPrenomAr() {
		return this.prenomAr;
	}

	public void setPrenomAr(String prenomAr) {
		this.prenomAr = prenomAr;
	}

	@Column(name = "raisonSociale")
	public String getRaisonSociale() {
		return this.raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "imageURL")
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "sexe")
	public Integer getSexe() {
		return this.sexe;
	}

	public void setSexe(Integer sexe) {
		this.sexe = sexe;
	}

	@Column(name = "tel")
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "fixe")
	public String getFixe() {
		return this.fixe;
	}

	public void setFixe(String fixe) {
		this.fixe = fixe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dt", length = 10)
	public Date getDt() {
		return this.dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	@Column(name = "LD", nullable = false)
	public boolean isLd() {
		return this.ld;
	}

	public void setLd(boolean ld) {
		this.ld = ld;
	}

	 

}
