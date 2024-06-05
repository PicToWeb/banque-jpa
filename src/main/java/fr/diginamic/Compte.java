package fr.diginamic;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "numero")
	private String numero;

	@Column(name = "solde")
	private Double solde;

	@ManyToMany
	@JoinTable(name = "CLI_COMPTE", joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"))
	private Set<Client> clients = new HashSet<>();

	@OneToMany(mappedBy = "compte") //attribut compte qui possede la notation inverse
	private Set<Operation> operations = new HashSet<>();

	/**
	 * Constructor
	 * 
	 */
	public Compte() {

	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param operations
	 */
	public Compte(String numero, Double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 * Getter for id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter for id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter for numero
	 * 
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter for numero
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * Setter for solde
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for clients
	 * 
	 * @return the clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * Setter for clients
	 * 
	 * @param clients the clients to set
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}
