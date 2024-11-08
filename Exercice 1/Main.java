package TD_IA.exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import TD_IA.exercice1.Epreuve;
import TD_IA.exercice1.ListeEpreuves;

public class Main {

	public static void main(String[] args) {
		
		String fichierEpreuves = "/workspaces/TD_IA/Exercice 1/Epreuves.txt";
		
		ListeEpreuves listeEpreuves = new ListeEpreuves(fichierEpreuves);

		System.out.println("#################################################");
		System.out.println("# Toutes les epreuves inscrites dans le fichier #");
		System.out.println("#################################################");
		
		System.out.println(listeEpreuves);
		System.out.println();
		
		listeEpreuves.triParHeureFin();
		
		System.out.println("#################################################");
		System.out.println("# Epreuves triees par horaires de fin croissant #");
		System.out.println("#################################################");
		
		System.out.println(listeEpreuves);
		System.out.println();
		
		/* 
		Epreuve e = listeEpreuves.get(4); //les lignes qui ont servis pour repondre au questions 3 et 4 
		listeEpreuves.eliminerConflits(e); //les lignes qui ont servis pour repondre au questions 3 et 4
		
		System.out.println("#################################################");
		System.out.println("#  Epreuves apres suppression des conflits de   #");
		System.out.println("#              l'epreuve de " +  e.getIntitule() + "             #");
		System.out.println("#################################################");
		
		
		System.out.println(listeEpreuves);
		System.out.println();
		*/
				
		ArrayList<Epreuve> planning = new ArrayList<Epreuve>();

        
        // Appliquer l'algorithme glouton : sélectionner les épreuves
        // triées par fin d'heure, qui ne se chevauchent pas.
        
        while (listeEpreuves.getListe().size() != 0) {
            planning.add(listeEpreuves.get(0));
            listeEpreuves.eliminerConflits(listeEpreuves.get(0));
            
        }
        
		
		// Implementez votre algorithme de planification efficace des epreuves. 
		// Les epreuves retenues seront ajoutees, au fur et a mesure dans "planning"
		
		Collections.sort((List<Epreuve>) planning);
		
		System.out.println("#################################################");
		System.out.println("#             Planning des epreuves             #");
		System.out.println("#################################################");
		
		for (int i = 0; i < planning.size(); i++) {
			System.out.println(planning.get(i));
		}
	}


}
