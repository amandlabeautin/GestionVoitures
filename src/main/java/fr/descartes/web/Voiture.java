package fr.descartes.web;

public class Voiture {
	
	String immatriculation;
	String marque;
	boolean disponible;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String immatriculation, String marque, boolean disponible) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.disponible = disponible;
	}

	public String getImmatriculation() {
		return immatriculation;
	}
	
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public boolean isDisponible() {
		return disponible;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Voiture [immaticulation=" + immatriculation + ", marque="
				+ marque + ", disponible=" + disponible + "]";
	}
	

}
