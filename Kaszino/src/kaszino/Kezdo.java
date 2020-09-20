package kaszino;

/**
 * @author ronaikovacs
 * Kezdőként viselkedő játékos.
 */
public class Kezdo extends Jatekos {
	private String nev;
	
	/**
	 * @param nev  Játékos neve
	 */
	public Kezdo(String nev)
	{
		this.nev = nev;
	}
	
	@Override
	public String toString() 
	{
		return nev;
	}
	
	/**
	 * A Kezdő passzol vagy 1-gyel emel.
	 */
	@Override
	public void lep() 
	{
		System.out.println(toString() + ": Ez a " + asztal.getKor() + ". kör");
		if (asztal.getKor() % 2 == 1)
			System.out.println("Passzolok.");
		else
		{
			asztal.emel(1.0);
			//System.out.println("Emelek 1-gyel.");
		}
		
		System.out.println();
	}
}
