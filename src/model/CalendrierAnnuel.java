package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		this.calendrier=new Mois[12];
		calendrier[0]=new Mois("Janvier",31);
		calendrier[1]=new Mois("Fevrier",28);
		calendrier[2]=new Mois("Mars",31);
		calendrier[3]=new Mois("Avril",30);
		calendrier[4]=new Mois("Mai",31);
		calendrier[5]=new Mois("Juin",30);
		calendrier[6]=new Mois("Juillet",31);
		calendrier[7]=new Mois("Aout",31);
		calendrier[8]=new Mois("Septembre",30);
		calendrier[9]=new Mois("Octobre",31);
		calendrier[10]=new Mois("Novembre",30);
		calendrier[11]=new Mois("Decembre",31);
		}
	
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.jours=new boolean[nbJours];
			this.nom=nom;
			for (int i=0; i<nbJours;i++) {
				jours[i]=true;
			}
		}
		
		private boolean estLibre(int jour) {
			return jours[jour];
		}
		
		private boolean reserver(int jour) {
			if (estLibre(jour)) {
				jours[jour]=false;
				return true;
			}
			else {return false;}
		}
		
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].jours[jour-1];
	}
	
	public boolean reserver(int jour,int mois) {
		if (calendrier[mois-1].reserver(jour-1)) {
			
			return true;
		}
		else {return false;}
	}
	
	

}
