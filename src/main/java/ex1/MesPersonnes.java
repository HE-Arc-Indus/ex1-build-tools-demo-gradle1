package ex1;

import ex1.Personne.*;

public class MesPersonnes { 
	public static void main(String[] args){
		Personne normand = new Personne("Normand","Paratte");
		Personne bastien = new Personne("Bastien","Mittempergher");
		Personne mael = new Personne("Mael","Voyame");
		
		normand.sePresenter();
		bastien.sePresenter();
		mael.sePresenter();
	}
}