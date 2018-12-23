package fr.dauphine.ja.mattishirel.model;

import java.util.List;

public class Ring extends Cercle  {
	
	private int rayonInterne;
	
	
	public Ring(Point centre, int rayon, int rayonInterne) {
		super(centre,rayon);
		if(rayonInterne<rayon){
			this.rayonInterne = rayonInterne;
		}
		else {
			System.out.println("il faut que le rayon interne soit plus petit que le rayon , rayon et rayon interne non initialisé!!");
		}
	}


	public Point getCentre() {
		return super.getCenter();
	}




	public int getRayon() {
		return super.getRayon();
	}


	


	public int getRayonInterne() {
		return rayonInterne;
	}


	public void setRayonInterne(int rayonInterne) {
		this.rayonInterne = rayonInterne;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj!=null){

			if(obj instanceof Ring){

				Ring r=(Ring)obj;
				if((r.getCenter().equals(getCenter()))&&(getRayon()==r.getRayon())&&(this.rayonInterne==r.getRayonInterne())){

					return true;
					
				}
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Ring [centre=" + getCenter() + ", rayon=" + getRayon()
				+ ", rayonInterne=" + rayonInterne + "]";
	}
	
	
	
	public boolean contains(Point p){
		return super.contains(p);
		
	}
	
	
	
	public static boolean contains(Point tp,Ring...rings) {
		for(Ring r:rings){
			if(!r.contains(tp)) return false;
		}
		return true;
		
	}
	


	
	
	
	
	
	

}
