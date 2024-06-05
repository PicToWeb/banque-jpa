package fr.diginamic;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adresse {

	private int numero;
	private String rue;
	private int codePostal;
	private String ville;

	/**
	 * Constructor
	 * 
	 */
	public Adresse() {

	}

	/**
	 * Constructor
	 * 
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(int numero, String rue, int codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/**
	 * Getter for numero
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter for numero
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter for rue
	 * 
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setter for rue
	 * 
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter for codePostal
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter for codePostal
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter for ville
	 * 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter for ville
	 * 
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
