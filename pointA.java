package td4;

public class pointA extends point {
	public pointA(double abscisse,double ordon�e){
		super(abscisse,ordon�e);
	}
	public void afficheCoor(){
		System.out.println("les coodonn�es  "+"("+getAbscisse()+","+getOrdon�e()+")");
	}
public static void main(String[] args){
	pointA p1=new pointA(6.2,-4.0);
	p1.afficheCoor();
}
}