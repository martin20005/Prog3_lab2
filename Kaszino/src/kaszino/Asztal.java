package kaszino;
import java.util.Random;

abstract public class Asztal 
{
	/** Asztalnál ülő játékosok */
	protected Jatekos[] jatekosok;
	
	/** Aktuális tét */
	protected double tet;
	
	/** Aktuális kör sorszáma */
	protected int kor;
	
	/** Célérték */
	protected double goal;
	
	
	/** Az asztalnál ülő Játékosok száma */
	protected int j_db;
	
	
	public Asztal() {}
	
	/**
	 * Új játék indítása
	 * <p>
	 * Kezdőértékek beállítása
	 */
	public abstract void ujJatek();
	
	/**
	 * Játékos asztaljoz ültetése
	 * @param j  Az új játékos
	 */
	public abstract void addJatekos(Jatekos j);
	
	/**
	 * @return  Aktuális kör száma
	 */
	public abstract int getKor();
	
	/**
	 * Tét emelése egy értékkel
	 * @param d  Az emelés értéke
	 */
	public abstract void emel(double d);
	
	/**
	 * Asztalnál ülő játékosok lépése
	 * @throws NincsJatekos  Üres asztal esetén nem lehet kör
	 */
	public abstract void kor() throws NincsJatekos;
	
	public abstract double getTet();
}
