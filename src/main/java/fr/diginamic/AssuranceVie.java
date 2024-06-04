package fr.diginamic;




import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class AssuranceVie extends Compte{


	@Column(name = "date_fin")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name = "taux")
	private Double taux;
	

	/**
	 * Constructor
	 * 
	 */
	public AssuranceVie() {

	}

	/** Getter for taux
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/** Setter for taux
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter for dateFin
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	

}
