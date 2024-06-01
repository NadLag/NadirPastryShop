package Service;

import Model.Produit;
import java.util.List;

public class Etiquetage<T extends Produit> {

   private String nomPatisserie;
   private String siteWeb;
   private String coordonnees;

   public Etiquetage(String nomPatisserie, String siteWeb, String coordonnees) {
      this.nomPatisserie = nomPatisserie;
      this.siteWeb = siteWeb;
      this.coordonnees = coordonnees;
   }

   // Méthode pour étiqueter une liste de produits
   public void etiqueterProduits(List<T> produits) {
      for (T produit : produits) {
         // Combiner avec les informations fournies
         String etiquette = nomPatisserie + "\n" + siteWeb + "\n" + coordonnees;
         // Application d'étiquette au produit
         produit.setEtiquette(etiquette);
      }
   }
}
