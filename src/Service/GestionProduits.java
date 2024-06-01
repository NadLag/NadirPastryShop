package Service;

import Model.*;
import Model.Interface.Emballable;
import Model.Interface.Perissable;
import Model.Interface.Refrigerable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduits {
   // Liste des produits gérés par cette classe
   private List<Produit> produits = new ArrayList<>();

   // Méthode pour ajouter des produits prédéfinis à la liste
   public void ajouterProduits() {
      System.out.println("\nAjout de produits :");

      // Ajout de différents produits à la liste
      ajouterProduit(new Gateau("Gâteau au chocolat", "G001", 0.5, 5.99));
      ajouterProduit(new PainFrais("Pain de campagne", "P001", 0.8, 2.99));
      ajouterProduit(new GateauGlace("Gâteau glacé à la fraise", "GG001", 0.7, 6.99, -18.0));
      ajouterProduit(new ConfitDeCanard("Confit de canard", "C001", 0.3, 8.99, "01/06/2023", "01/12/2024"));
      ajouterProduit(new Confiture("Confiture de framboise", "CF001", 0.2, 3.99, "15/09/2023", "15/03/2025"));

      // Création d'un objet Etiquetage pour étiqueter les produits
      Etiquetage<Produit> pastryEtiquetage = new Etiquetage<>("Nadir Pastry Shop", "www.SiteWebici.com", "123 Rue des Adresse, 75000 Ville, Pays");
      pastryEtiquetage.etiqueterProduits(produits);

      System.out.println("Produits ajoutés avec succès.");
   }

   // Méthode pour afficher tous les produits
   public void afficherTousProduits() {
      // Vérifie si la liste de produits est vide
      if (produits.isEmpty()) {
         System.out.println("Aucun produit à afficher.");
      } else {
         // Affiche les informations de chaque produit
         for (Produit produit : produits) {
            afficherInformationsProduit(produit);
         }
      }
   }

   // Méthode pour rechercher un produit par son code unique
   public void rechercherProduit(Scanner scanner) {
      System.out.print("Entrez le code unique du produit à rechercher : ");
      String codeUnique = scanner.nextLine();
      Produit produitRecherche = rechercherProduitParCodeUnique(codeUnique);
      if (produitRecherche != null) {
         System.out.println("Produit trouvé : " + produitRecherche);
      } else {
         System.out.println("Aucun produit trouvé avec le code unique '" + codeUnique + "'");
      }
   }

   // Méthode pour supprimer un produit par son code unique
   public void supprimerProduit(Scanner scanner) {
      System.out.print("Entrez le code unique du produit à supprimer : ");
      String codeUnique = scanner.nextLine();
      if (supprimerProduitParCodeUnique(codeUnique)) {
         System.out.println("Produit supprimé avec succès.");
      } else {
         System.out.println("Aucun produit trouvé avec le code unique '" + codeUnique + "'");
      }
   }

   // Méthode privée pour ajouter un produit à la liste
   private void ajouterProduit(Produit produit) {
      produits.add(produit);
   }

   // Méthode pour afficher les informations détaillées d'un produit
   private void afficherInformationsProduit(Produit monProduit) {
      System.out.println(monProduit);
      System.out.println("Description : " + monProduit.getDescription());

      // Affiche les informations supplémentaires selon le type de produit
      switch (getTypesProduit(monProduit)) {
         case EMBALLABLE:
            afficherInformationsEmballable((Emballable) monProduit);
            break;
         case PERISSABLE:
            afficherInformationsPerissable((Perissable) monProduit);
            break;
         case REFRIGERABLE:
            afficherInformationsRefrigerable((Refrigerable) monProduit);
            break;
         case PRODUIT_LOCAL:
            afficherInformationsProduitLocal((ProduitLocal) monProduit);
            break;
         default:
            break;
      }

      System.out.println();
   }

   // Méthode pour rechercher un produit par son code unique
   private Produit rechercherProduitParCodeUnique(String codeUnique) {
      for (Produit in : produits) {
         if (in.getCodeUnique().equals(codeUnique)) {
            return in;
         }
      }
      return null;
   }

   // Méthode pour supprimer un produit par son code unique
   private boolean supprimerProduitParCodeUnique(String codeUnique) {
      Produit produitASupprimer = rechercherProduitParCodeUnique(codeUnique);
      if (produitASupprimer != null) {
         produits.remove(produitASupprimer);
         return true;
      }
      return false;
   }

   // Méthode pour afficher les informations d'un produit emballable
   private void afficherInformationsEmballable(Emballable emballable) {
      System.out.println("Nécessite un emballage : " + emballable.necessiteEmballage());
      System.out.println("Emballage biodégradable : " + emballable.estEmballageBiodegradable());
   }

   // Méthode pour afficher les informations d'un produit périssable
   private void afficherInformationsPerissable(Perissable perissable) {
      System.out.println("Produit frais : " + perissable.estFrais());
   }

   // Méthode pour afficher les informations d'un produit réfrigérable
   private void afficherInformationsRefrigerable(Refrigerable refrigerable) {
      System.out.println("Température de réfrigération : " + refrigerable.getTemperatureRefrigeration() + "°C");
      System.out.println("Bien réfrigéré : " + refrigerable.estBienRefrigere());
   }

   // Méthode pour afficher les informations d'un produit local
   private void afficherInformationsProduitLocal(ProduitLocal produitLocal) {
      System.out.println("Date de mise en conserve : " + produitLocal.getDateMiseEnConserve());
      System.out.println("Date de fin de validité : " + produitLocal.getDateFinValidite());
   }

   // Méthode pour déterminer les types de produit (emballable, périssable, réfrigérable, local)
   private TypesProduit getTypesProduit(Produit produit) {
      TypesProduit typesProduit = TypesProduit.AUCUN;

      if (produit instanceof Emballable) {
         typesProduit = TypesProduit.EMBALLABLE;
      }

      if (produit instanceof Perissable) {
         typesProduit = TypesProduit.PERISSABLE;
      }

      if (produit instanceof Refrigerable) {
         typesProduit = TypesProduit.REFRIGERABLE;
      }

      if (produit instanceof ProduitLocal) {
         typesProduit = TypesProduit.PRODUIT_LOCAL;
      }

      return typesProduit;
   }
}
