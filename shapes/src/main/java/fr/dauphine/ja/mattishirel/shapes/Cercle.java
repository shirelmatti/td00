package fr.dauphine.ja.mattishirel.shapes;

import java.util.List;

public class Cercle {
	private Point p;
	private double rayon;
	
	public Cercle(Point p, double rayon) {
		this.p = p;
		this.rayon = rayon;
	}
	
	public String toString(){
		return "("+p+"///"+rayon+")";
	}
	
	public void translate(double dx,double dy ) {
		p.translate(dx, dy);
	}
	
	public Point getCenter(){
		return new Point(p.getX(),p.getY());
	}
	
	public double getRayon(){
		return rayon;
	}
	
	public double surface(){
		return Math.PI*rayon*rayon;
	}
	
	public boolean contains(Point np) {
		Point PtDeDepart=new Point(p.getX()-rayon,p.getY());
		Point PtDeFin=new Point(p.getX()+rayon,p.getY());
		
		//On calcule la distance entre les points PtDeDepart et PtDeFin qui seront l'hypotenuse
		double BC=((PtDeFin.getX()-PtDeDepart.getX())*(PtDeFin.getX()-PtDeDepart.getX()))+((PtDeFin.getY()-PtDeDepart.getY())*(PtDeFin.getY()-PtDeDepart.getY()));
		
		
		//On calcule AB et AC
		double AB=((PtDeDepart.getX()-np.getX())*(PtDeDepart.getX()-np.getX()))+((PtDeDepart.getY()-np.getY())*(PtDeDepart.getY()-np.getY()));
		double AC=((PtDeFin.getX()-np.getX())*(PtDeFin.getX()-np.getX()))+((PtDeFin.getY()-np.getY())*(PtDeFin.getY()-np.getY()));
		
		// On verifie le theoreme de pythagore
		

		if((AB+AC)==BC) return true;
		return false;
		
		
	}
	
	
	public static boolean contains(Point tp,List<Cercle> l) {
		for(Cercle c: l) {
			if(c.contains(tp)) return true; 
		}
		
		return false;
		
	}
	
	
	

}
