package fr.dauphine.ja.mattishirel.shapes;

import java.util.List;

public class Ring extends Cercle{
	
	private double rayonInterne;
	
	
	public Ring(Point centre, double rayon, double rayonInterne) {
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




	public double getRayon() {
		return super.getRayon();
	}


	


	public double getRayonInterne() {
		return rayonInterne;
	}


	public void setRayonInterne(double rayonInterne) {
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
	
	public static void main(String[] args){
		Ring r=new Ring(new Point(3,4),7,6);
		Ring r2=new Ring(new Point(3,4),7,6);
		System.out.println(r.equals(r2));
		System.out.println(r);
		
	}
	
	public boolean contains(Point p){
		return super.contains(p);
		
	}
	
	
	
	public static boolean contains(Point tp,List<Cercle> l) {
		return false;
		
	}
	


	
	
	
	
	
	

}
