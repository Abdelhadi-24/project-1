package tp3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

	public class Repertoire {
		  private int maxAbonnes;
		    private ArrayList<Abonne> abonnes;

		    public Repertoire(int maxAbonnes) {
		        this.maxAbonnes = maxAbonnes;
		        this.abonnes = new ArrayList<>();
		    }

		    public boolean addAbonne(Abonne abonne) {
		        if (abonnes.size() < maxAbonnes) {
		            abonnes.add(abonne);
		            return true;
		        } else {
		            return false;
		        }
		    }

		    public String getnumero(String nom) {
		        for (Abonne abonne : abonnes) {
		            if (abonne.toString().contains(nom)) {
		                return abonne.toString();
		            }
		        }
		        return null;
		    }

		    public int getNAbonnes() {
		        return abonnes.size();
		    }

		    public Abonne getAbonne(int rang) {
		        if (rang >= 0 && rang < abonnes.size()) {
		            return abonnes.get(rang);
		        } else {
		            return null;
		        }
		    }

		    
		    
		    public String toString() {
		        StringBuilder result = new StringBuilder();
		        for (Abonne abonne : abonnes) {
		            result.append(abonne).append("\n");
		        }
		        return result.toString();
		    }
	}



