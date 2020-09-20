package kaszino;
import java.lang.ref.WeakReference;

public class WeakAsztal extends Asztal 
{
	WeakReference<Jatekos> jatekosok[];
	
	public WeakAsztal() 
	{
		jatekosok = (WeakReference<Jatekos>[]) new WeakReference[10]; 
		for (WeakReference<Jatekos> j : jatekosok) 
		{
			j = null;
		}
	}
	
	@Override
	public void addJatekos(Jatekos j) 
	{
		if (j_db < 10)
		{
			jatekosok[j_db++] = new WeakReference(j);
		}
	}

	@Override
	public void ujJatek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getKor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void emel(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kor() throws NincsJatekos {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTet() {
		// TODO Auto-generated method stub
		return 0;
	}
}
