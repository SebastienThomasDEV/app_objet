package tp_auto.test;
import tp_auto.classes.Salarie;
public class TestChaines {
    public static void main(String[] args) {
        // Déclaration de la chaine de caractères
        String chaine = "Durand;Marcel;2 523.5";

        // 1) Afficher le premier caractère de la chaine de caractères
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        // 2) Afficher la longueur de la chaine de caractères
        int longueurChaine = chaine.length();
        System.out.println("Longueur de la chaine: " + longueurChaine);

        // 3) Afficher l’index du premier ';' contenu dans la chaine de caractères
        int indexPointVirgule = chaine.indexOf(';');
        System.out.println("Index du premier ';' : " + indexPointVirgule);

        // 4) Extraire le nom de famille de la personne
        String nomFamille = chaine.substring(0, indexPointVirgule);
        System.out.println("Nom de famille : " + nomFamille);

        // 5) Afficher le nom de famille en majuscules
        String nomFamilleMajuscules = nomFamille.toUpperCase();
        System.out.println("Nom de famille en majuscules : " + nomFamilleMajuscules);

        // 6) Afficher le nom de famille en minuscules
        String nomFamilleMinuscules = nomFamille.toLowerCase();
        System.out.println("Nom de famille en minuscules : " + nomFamilleMinuscules);

        // 7) Découper la chaine de caractères en morceaux
        String[] morceaux = chaine.split(";");
        System.out.println("Morceaux de la chaine : ");
        for (String morceau : morceaux) {
            System.out.println(morceau);
        }

        // 8) Création de la classe Salarie avec 3 attributs
        // (voir ci-dessous pour la classe Salarie)

        // 9) Création de l'instance de Salarie à partir des morceaux de chaine de caractères
        String nom = morceaux[0];
        String prenom = morceaux[1];
        String salaireString = morceaux[2].replace(" ", ""); // Supprimer l'espace
        double salaire = Double.parseDouble(salaireString);
        Salarie salarie = new Salarie(nom, prenom, salaire);
    }
}
