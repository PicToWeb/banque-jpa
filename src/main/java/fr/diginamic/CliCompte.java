package fr.diginamic;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CLI_COMPTE")
public class CliCompte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="ID_COMPTE")
	private int idCompte;
	
	@Column(name="ID_CLIENT")
	private int idClient;
	
	
	/** Constructor
	 * 
	 */
	public CliCompte() {
		
	}


	/** Getter for id
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/** Setter for id
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/** Getter for idCompte
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}


	/** Setter for idCompte
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}


	/** Getter for idClient
	 * @return the idClient
	 */
	public int getIdClient() {
		return idClient;
	}


	/** Setter for idClient
	 * @param idClient the idClient to set
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	
	
}
