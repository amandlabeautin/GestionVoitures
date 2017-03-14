package fr.descartes.web;

public class Voiture {
	
	String immaticulation;
	String marque;
	boolean disponible;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String immaticulation, String marque, boolean disponible) {
		super();
		this.immaticulation = immaticulation;
		this.marque = marque;
		this.disponible = disponible;
	}

	public String getImmaticulation() {
		return immaticulation;
	}
	
	public void setImmaticulation(String immaticulation) {
		this.immaticulation = immaticulation;
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
		return "Voiture [immaticulation=" + immaticulation + ", marque="
				+ marque + ", disponible=" + disponible + "]";
	}
	

}
