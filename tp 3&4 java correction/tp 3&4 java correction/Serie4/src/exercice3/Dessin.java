package exercice3;
import exercice2.Rectangle;

public class Dessin {
	Rectangle t[];
	int c , i ;
	int s=0; //initialisation de la somme des urfaces
	
	Dessin(int n)
	{
		t=new Rectangle[n]; //fixation de la taille du tableau
		c=0; //initialiser le compteur
	}
	
	void ajouter(Rectangle R, int i)
	{
			t[i]=R; //ajout d'un rectangle à un dessin
			c++; //incrementation du compteur
	}
	
	double surface()
	{
		for(i=0;i<c;i++)
			s+=t[i].surface(); //calculer la surface de chaque rectangle et l'ajouter à la somme
		return(s);		
	}
	
	void translate(double x, double y)
	{
		for(i=0;i<c;i++)
			t[i].translate(x,y); //translater les rectangles un à un
	}
	
}
