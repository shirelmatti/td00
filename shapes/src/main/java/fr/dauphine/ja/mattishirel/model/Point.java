package fr.dauphine.ja.mattishirel.model;

public class Point extends Shapes {
	private int  x,y;
	private static int nbPoints=0;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
		this.nbPoints++;
	}
	public Point(){
		this.x=5;
		this.y=7;
		this.nbPoints++;
	}
	public int getX() {
		return x;
	}
	
	public Point(Point p){
		this.x=p.getX();
		this.y=p.getY();
		this.nbPoints++;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "("+getX()+","+getY()+")";
	}
	
	public boolean isSameAs(Point p){
		return (p.getX()==this.getX() && p.getY()==this.getY());
	}
	
	public void translate(int dx, int dy){
		setX(this.x+dx);
		setY(this.y+dy);
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj) return true;
		if(obj==null) return false;
		if(!(obj instanceof Point)) return false;
		Point p= (Point)obj;
		return this.isSameAs(p);
		
	}

	
}
