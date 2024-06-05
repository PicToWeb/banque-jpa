package fr.diginamic;




import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class Virement extends Operation{


	@Column(name = "benificiaire")
	private String beneficiaire;

	/**
	 * Constructor
	 * 
	 */
	public Virement() {

	}
	
	

//	/** Constructor
//	 * @param date
//	 * @param montant
//	 * @param motif
//	 */
//	public Virement(Date date, Double montant, String motif, String beneficiaire) {
//		super(date, montant, motif);
//		this.beneficiaire = beneficiaire;
//	}



	/** Getter for beneficiaire
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/** Setter for beneficiaire
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	


}
