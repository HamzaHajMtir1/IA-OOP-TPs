package compteBank;

public class Compte {
	private double m_solde;
	private double maxRetrait;
	private String nom;
	static long nbComptes=0;
	private long id;

	public Compte(String nom, double y, double x){
		id = nbComptes;
		nbComptes++;
		
		this.nom= nom;
		m_solde = x;
		maxRetrait = y;
	}
	
	public double getSolde(){
	return m_solde;
	}
	
	public void crediter(double x){
	m_solde = m_solde + x;
	System.out.println("Succée !");
	}
	
	public void debiter(double x){
		if (x>maxRetrait)
			System.out.println(("Erreur : Max retrait = "+maxRetrait));
		else if (m_solde<x)
			System.out.println("Erreur : Solde insuffisant \n Votre solde :"+m_solde);
		else
			{m_solde -= x;
			 System.out.println("Succée !");
			
			}
	}
	
	void details(){
		System.out.println(nom +" || "+id+" || "+this.getSolde());
	}
	
	public void virerVers(Compte cb, double mt){
		if (mt<m_solde){
			cb.crediter(mt);
			this.m_solde=m_solde-mt;
			System.out.println("Succée !");}
		else 
			System.out.println("Erreur : Solde insuffisant \n Votre solde :"+m_solde);
	
	}
}

