package fr.diginamic;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class LivretA extends Compte{


	@Column(name = "taux")
	private Double taux;

	/**
	 * Constructor
	 * 
	 */
	public LivretA() {

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


}
