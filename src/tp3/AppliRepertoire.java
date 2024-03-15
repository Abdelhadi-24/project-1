package tp3;
public class AppliRepertoire {
	 public static void main(String[] args) {
	        Repertoire repertoire = new Repertoire(5);
	        Abonne abonne1 = new Abonne("Anis", "0557123456");
	        Abonne abonne2 = new Abonne("abdou", "0568654321");
	        Abonne abonne3 = new Abonne("Aymen", "0587987654");

	        repertoire.addAbonne(abonne1);
	        repertoire.addAbonne(abonne2);
	        repertoire.addAbonne(abonne3);

	        System.out.println("Nombre d'abonnés: " + repertoire.getNAbonnes());
	        System.out.println("Abonné en position 1: " + repertoire.getAbonne(1));
	        System.out.println("Abonnés triés:");
	        for (Abonne abonne : repertoire.getAbonnesTries()) {
	            System.out.println(abonne);
	        }
	        System.out.println("le numéro de Anis: " + repertoire.getnumero("Anis"));
	    }

}


	

	



