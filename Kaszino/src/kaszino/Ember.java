package kaszino;
import java.util.Scanner;

/**
 * @author ronaikovacs
 * Felhasználó által kezelhető játékos.
 */
public class Ember extends Jatekos {
	public Ember() {}
	
	/**
	 * Felhasználó lépése
	 * <p>
	 * A felhasználó kedve szerint emelhet.
	 */
	@Override
	public void lep() 
	{
		System.out.println("Jelenleg a tét: " + asztal.getTet());
		System.out.println("Mennyivel emelsz? ");
		
		double emeles = Double.parseDouble((new Scanner(System.in)).next());
		asztal.emel(emeles);
		
	}
	
	@Override 
	public String toString() 
	{
		return "Te";
	}
}
