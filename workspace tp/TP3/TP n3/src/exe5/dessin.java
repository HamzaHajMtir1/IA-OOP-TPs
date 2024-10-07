package exe5;
import exe4.rectangle;

public class dessin {
	rectangle tab[];
	int comp;
	public dessin(int taille)
	{
		tab=new rectangle[taille];
	}
	public void ajouter(rectangle rec)
	{
		tab[comp]=rec;
		comp++;
	}
	public void surface()
	{
		double s=0;
		
		for(int i = 0 ;i<tab.length; i++)
		{
			s += tab[i].surface();
		}
		System.out.println("surface de dessin =" + s);
	}
	
	public void translate(float dx , float dy)
	{
		for(int i = 0;i<tab.length;i++)
		{
			tab[i].translate(dx, dy);
		}
	}

	public static void main(String[] args) {
		
		
		
	}

}
