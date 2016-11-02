package td4;

public class pointNom extends pointA{
	private String nom;
	 public String getNom(){return nom;}
	
 public pointNom(String nom ,double abscisse,double ordonée){
	 super(abscisse,ordonée);
	 this.nom=nom;
 }
 
 
public void afficheCoor(){
	System.out.print("le point "+ nom+" a ");
	super.afficheCoor();
}
public static void main(String[] args){

	pointNom p1=new pointNom("p1",6.2,-4.0);
	p1.afficheCoor();
}
}
