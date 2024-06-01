package Main;

import Service.GestionProduits;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      // Création d'une instance de GestionProduits
      GestionProduits gestionProduits = new GestionProduits();

      // Création d'un scanner pour lire les entrées de l'utilisateur
      Scanner scanner = new Scanner(System.in);
      int choix;

      // Boucle pour afficher le menu et prendre les choix de l'utilisateur
      do {
         afficherMenu();
         choix = scanner.nextInt();
         scanner.nextLine();

         // Utilisation d'un switch pour traiter les choix de l'utilisateur
         switch (choix) {
            case 1:
               // Ajouter un produit
               gestionProduits.ajouterProduits();
               break;
            case 2:
               // Afficher tous les produits
               gestionProduits.afficherTousProduits();
               break;
            case 3:
               // Rechercher un produit
               gestionProduits.rechercherProduit(scanner);
               break;
            case 4:
               // Supprimer un produit
               gestionProduits.supprimerProduit(scanner);
               break;
            case 5:
               // Quitter le programme
               System.out.println("Merciiiiiiii, Au revoir !");
               break;
            default:
               // Si l'utilisateur entre un choix invalide
               System.out.println("Choix invalide. Veuillez réessayer.");
         }
      } while (choix != 5); // Répéter tant que le choix n'est pas (5) pour quitter
   }

   // Méthode pour afficher le menu
   private static void afficherMenu() {
      System.out.println("\nMenu :");
      System.out.println("*".repeat(100));
      System.out.println("1. Ajouter des produits");
      System.out.println("2. Afficher tous les produits");
      System.out.println("3. Rechercher un produit");
      System.out.println("4. Supprimer un produit");
      System.out.println("5. Quitter");
      System.out.println("*".repeat(100));
      System.out.print("Votre choix : ");
   }
}
