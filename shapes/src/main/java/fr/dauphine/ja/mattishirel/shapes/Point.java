package fr.dauphine.ja.mattishirel.shapes;

public class Point {
	private double x,y;
	private static int nbPoints=0;
	
	public Point(double x,double y){
		this.x=x;
		this.y=y;
		this.nbPoints++;
	}
	public Point(){
		this.x=5.0;
		this.y=7.0;
		this.nbPoints++;
	}
	public double getX() {
		return x;
	}
	
	public Point(Point p){
		this.x=p.getX();
		this.y=p.getY();
		this.nbPoints++;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "("+getX()+","+getY()+")";
	}
	
	public boolean isSameAs(Point p){
		return (p.getX()==this.getX() && p.getY()==this.getY());
	}
	
	public void translate(double dx, double dy){
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

	public static void main(String[] args) {
		Point p=new Point(3,4);
		System.out.println(p.x+" "+p.y);
	}
}
