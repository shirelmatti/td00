package fr.dauphine.ja.mattishirel.model;

import java.util.LinkedList;

public class ligneBrisee extends Shapes {
	private int maxP;
	private LinkedList<Point> tab=new LinkedList<>();
	private int index;
	
	
	public ligneBrisee(int maxP){
		this.maxP=maxP;
		this.index=0;
	}
	
	public void add(Point p){
		if(p!=null){
			if(index<maxP){
				tab.add(p);
				index++;
			} else System.out.println("plus de place dans la tableau");
		}
	}
	
	public int pointCapacity(){
		return maxP;
	}
	
	public int nbPoints(){
		return tab.size();
	}
	
	public boolean contains(Point p) {
		for(Point dansTab:tab) {
			if(dansTab==null) {
				return false;
			}
			if(p.isSameAs(dansTab)){
				return true;
			}
			
		}
		return false;
	}
	
	public LinkedList<Point> takeList(){
		return tab;
	}
	
	
	
	
}
