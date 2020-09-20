package kaszino;

/**
 * @author ronaikovacs
 * Általános játékos
 * <p>
 * A leszármazottak tudnak játszani az asztalnál
 * 
 */
abstract public class Jatekos {
	/**
	 * Az asztal, ahol a játékos játszik.
	 */
	protected Asztal asztal;
	
	/**
	 * Leírja, hogyan cselekszik a játékos, 
	 * mikor sorra kerül a körben.
	 */
	public void lep() {
		String tajekoztatas = 
				asztal.getKor() + ". kör, a tét " + asztal.getTet();
		System.out.println(tajekoztatas);
	}
	
	/**
	 * Asztal megadása
	 * @param a  Az asztal
	 */
	public void setAsztal(Asztal a) {
		asztal = a;
	}
	
}
