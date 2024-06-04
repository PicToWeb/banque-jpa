package fr.diginamic;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class Virement extends Operation{


	@Column(name = "benificiaire")
	private String Beneficiaire;

	/**
	 * Constructor
	 * 
	 */
	public Virement() {

	}

	/** Getter for beneficiaire
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return Beneficiaire;
	}

	/** Setter for beneficiaire
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		Beneficiaire = beneficiaire;
	}

	


}
