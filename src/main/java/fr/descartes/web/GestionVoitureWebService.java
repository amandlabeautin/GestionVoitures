package fr.descartes.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class GestionVoitureWebService {
	
	@RequestMapping(value = "/voiture", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void creerVoiture(@RequestBody Voiture voiture){
		System.out.println("creerVoiture: " + voiture);
	}
	
	@RequestMapping(value = "/voiture", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void modifierVoiture(@RequestBody Voiture voiture){
		System.out.println("modifierVoiture: " + voiture);
	}
	
	@RequestMapping(value = "/voiture/{immatriculation}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void supprimerVoiture(@PathVariable(value="immatriculation") String immat){
		System.out.println("supprimerVoiture: " + immat);
	}
	
	@RequestMapping(value = "/voiture/{immatriculation}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Voiture obtenirUneVoiture(@PathVariable(value="immatriculation") String immat){
		return new Voiture("11AA22", "Ferrari", true); 
	}
	
	@RequestMapping(value = "/voiture", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Voiture> obtenirUneListeDeVoitures(){
		List<Voiture> listes  = new  ArrayList<Voiture>();
		listes.add(new Voiture("11AA22", "Ferrari", true));
		listes.add(new Voiture("22QQ33", "Peugeot", true));
		return listes;
	}
	
}
