package animale;

public class Animalerie extends animale {

	public Animalerie(String race, String nom, String bruit) {
        super(race, nom, bruit);

    }
	
	public void addAnimal(animale a) {
		animale t[]=new animale[100];
		for(int i=0;i<t.length;i++) {
			System.out.println("l'animale num "+i+1);
			if(t[i]==null)
				break;
			t[i]=a;
		}
	}
}
