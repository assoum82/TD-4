package td4;

public class pointA extends point {
	public pointA(double abscisse,double ordonée){
		super(abscisse,ordonée);
	}
	public void afficheCoor(){
		System.out.println("les coodonnées  "+"("+getAbscisse()+","+getOrdonée()+")");
	}
public static void main(String[] args){
	pointA p1=new pointA(6.2,-4.0);
	p1.afficheCoor();
}
}