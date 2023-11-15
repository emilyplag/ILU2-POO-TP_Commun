package model;

public class ReservationRestaurant extends Reservation{
	int numservice;
	int numtable;
	
	public ReservationRestaurant(int jour, int mois, int numservice,int numtable){
		super(jour,mois);
		this.numservice=numservice;
		this.numtable=numtable;
	} 
	
	
	@Override
	public String toString() {
		StringBuilder chaine=new StringBuilder("Le "+jour+"/"+mois+" Table "+numtable);
		if (numservice== 1) {
		chaine.append( " pour le premier service.");
		}
		else {
			chaine.append(" pour le deuxième service.");
		}
		return chaine.toString();
	}
}
