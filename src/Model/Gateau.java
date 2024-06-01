package Model;

import Model.Interface.Emballable;
import Model.Interface.Perissable;
import Model.Interface.Refrigerable;

public class Gateau extends Produit implements Emballable, Perissable, Refrigerable {

   public Gateau(String nom, String codeUnique, double poids, double prix) {
      super(nom, codeUnique, poids, prix);
   }

   @Override
   public String getDescription() {
      // Retourne la description spécifique pour Gateau
      return "Gâteau";
   }

   @Override
   public String necessiteEmballage() {
      // Retourne "Oui" pour indiquer que le gâteau nécessite un emballage
      return "Oui";
   }

   @Override
   public String estEmballageBiodegradable() {
      // Retourne "Non" pour indiquer que l'emballage n'est pas biodégradable
      return "Non";
   }

   @Override
   public boolean estFrais() {
      // Retourne true pour indiquer que le gâteau est un produit frais
      return true;
   }

   @Override
   public double getTemperatureRefrigeration() {
      // Retourne la température de réfrigération nécessaire pour le gâteau
      return 4.0;
   }

   @Override
   public boolean estBienRefrigere() {
      // Retourne true pour indiquer que le gâteau est bien réfrigéré
      return true;
   }
}
