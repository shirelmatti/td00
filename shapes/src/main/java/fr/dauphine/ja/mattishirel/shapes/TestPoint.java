package fr.dauphine.ja.mattishirel.shapes;

import java.util.ArrayList;
import java.util.List;



public class TestPoint {
	public static void main(String[] args) {
		
		/*-----Exercice2-------*/
		/*Point p=new Point(); 
		System.out.println(p);*/
		//System.out.println(p.x+" "+p.y);*/
		
		
		/*-----Exercice2-------*/
		/*Point p1=new Point(1,2); 
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1==p2); System.out.println(p1==p3);
		
		System.out.println("avec la methode isSameAs:");
		System.out.println(p1.isSameAs(p2));
		System.out.println(p1.isSameAs(p3));
		
		
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1); 
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		*/
		
		/*-----Exercice3-----*/
		
		/*ligneBrisee l=new ligneBrisee(3);
		l.add(p1);
		l.add(p2);
		Point p4=new Point(4,5);
		
		System.out.println(l.contains(p3));*/
		
		
		/*------Exercice4-------*/
		/*Point p=new Point(1,2); 
		Cercle c=new Cercle(p,1);
		Cercle c2=new Cercle(new Point(p.getX(),p.getY()),2); 
		c2.translate(1,1);
		System.out.println(c+" "+c2);*/
		
		 /*Cercle c1=new Cercle(new Point(1,2), 1);
		 c1.getCenter().translate(1,1); 
		 System.out.println(c1);*/
		
		Cercle c=new Cercle(new Point(4,3), 3);
		System.out.println(c.contains(new Point(4,6)));
		List<Cercle> cercles=new ArrayList<>();
		cercles.add(c);
		System.out.println(Cercle.contains(new Point(4,6), cercles));
		
		
		
		
	}
}
