package com.sessionbeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CompatableSessionBean
 */
@Stateless
@LocalBean
public class ComptableSessionBean implements MyFunctions{

    /**
     * Default constructor. 
     */
    public ComptableSessionBean() {
        // TODO Auto-generated constructor stub
    }
    public void enregistrerVente() {
	}
	@Override
	public void snregistrerVentes() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void identification() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enregistrerEnvoi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void voirVente() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transmettreFacture(String client) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getPaiement() {
		return "Voici le paiement";
	}
	@Override
	public void voirEnvoi() {
		// TODO Auto-generated method stub
		
	}

}
