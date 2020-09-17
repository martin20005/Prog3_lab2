package kaszino;

public class Main {
	static public void main(String[] args) {
		Asztal asztal = new Asztal();
		Jatekos[] jatekosok = new Jatekos[3];
		jatekosok[0] = new Kezdo("Egyik");
		jatekosok[1] = new Kezdo("Masik");
		jatekosok[2] = new Robot();
		
		for (Jatekos j : jatekosok) 
		{
			asztal.addJatekos(j);
		}
		
		for (int i = 0; i < 3; i++) 
		{
			asztal.kor(); 
		}
	}
}
