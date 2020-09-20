package kaszino;

/**
 * @author ronaikovacs
 * Mester típusú játékos
 */
public class Mester extends Jatekos {
	/** Mesterfokozat mértéke */
	private int fokozat;
	
	/**
	 * @param fokozat  A mesterfokozat mértéke
	 */
	public Mester(int fokozat)
	{
		this.fokozat = fokozat;
	}
	
	@Override
	public String toString() 
	{
		return "Mester, " + fokozat + ". fokozat";
	}
	
	/**
	 * A Mester emelése a téttel arányos és függ a fokozattól
	 */
	@Override
	public void lep()
	{
		System.out.println(toString() + ": " + asztal.getKor() + ". kör");
		asztal.emel(asztal.getTet() * ((double)(100 + fokozat) / 100.0));
		System.out.println();
	}
}
