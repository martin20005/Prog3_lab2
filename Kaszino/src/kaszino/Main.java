package kaszino;

public class Main {
	static public void main(String[] args) {
		Asztal asztal = new Asztal();
		Jatekos[] j = new Jatekos[3];
		for (int i = 0; i < 3; i++) {
			j[i] = new Jatekos();
			asztal.addJatekos(j[i]);
		}
		
		for (int i = 0; i < 3; i++) 
		{
			asztal.kor(); 
		}
	}
}
