package kaszino;

/**
 * @author ronaikovacs
 * Nyuszi-játékos leírása
 */
public class Nyuszi extends Jatekos {
	/** Nyuszi színe */
	private String szin;
	
	public Nyuszi(String szin) 
	{
		this.szin = szin;
	}
	
	@Override
	public String toString() 
	{
		return szin;
	}
	
	/** 
	 * A Nyuszi egy bizonyos tétig folytonosan emel, de utána már nem mer.
	 */
	@Override 
	public void lep() 
	{
		System.out.println(toString() + ", " + asztal.getKor() + ". kör");
		
		if (asztal.getTet() < 50.0)
		{
			asztal.emel(5);
		}
		else
		{
			System.out.println("Húha!");
		}
		System.out.println();
	}
}
