package tp3;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        String[] nomsEleves = {"Anis", "abdou", "Aymen"};
	        Eleve[] eleves = new Eleve[nomsEleves.length];

	        for (int i = 0; i < nomsEleves.length; i++) {
	            eleves[i] = new Eleve(nomsEleves[i]);
	            Scanner scanner = new Scanner(System.in);

	            System.out.println("donner les notes d'exams " + nomsEleves[i] + ":");
	            for (int j = 0; j < 3; j++) {
	                System.out.print("Score " + (j + 1) + ": ");
	                eleves[i].notes[j] = scanner.nextDouble();
	            }

	            eleves[i].calculerMoyenne();
	        }

	        System.out.println("Results:");
	        for (Eleve eleve : eleves) {
	            System.out.println(eleve);
	        }
	    }

}
