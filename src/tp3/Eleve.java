package tp3;


import java.util.Scanner;

enum Admissibilite {
	    NA("Non admis"),
	    P("Passable"),
	    AB("Assez bien"),
	    B("Bien"),
	    TB("Très bien");
private final String label;

	    Admissibilite(String label) {
	        this.label = label;
	    }

	    public String getLabel() {
	        return label;
	    }
	}

class Eleve {
	    private String nom;
	    private Admissibilite admissibilite;
	    private double[] notes;

	    public Eleve(String nom) {
	        this.nom = nom;
	        this.notes = new double[3];
	    }

	    public void calculerMoyenne() {
	        double moyenne = (notes[0] + notes[1] + notes[2]) / 3;
	        if (moyenne < 10) {
	            admissibilite = Admissibilite.NA;
	        } else if (moyenne < 12) {
	            admissibilite = Admissibilite.P;
	        } else if (moyenne < 14) {
	            admissibilite = Admissibilite.AB;
	        } else if (moyenne < 16) {
	            admissibilite = Admissibilite.B;
	        } else {
	            admissibilite = Admissibilite.TB;
	        }
	    }

	    public Admissibilite getAdmissibilite() {
	        return admissibilite;
	    }

	    
	    public String toString() {
	        return nom + ": " + admissibilite.getlabel();
	    }
	

	
	}

}
