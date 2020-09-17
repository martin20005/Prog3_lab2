package kaszino;

public class Robot extends Jatekos {
	
	@Override
	public String toString() 
	{
		return "Robot";
	}
	
	@Override
	public void lep() 
	{
		System.out.println(toString() + ": Ez a " + asztal.getKor() + ". kör");
	}
}
