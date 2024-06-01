package Model;

import Model.Interface.Emballable;
import Model.Interface.Perissable;

public class PainFrais extends Produit implements Emballable, Perissable {

   public PainFrais(String nom, String codeUnique, double poids, double prix) {
      super(nom, codeUnique, poids, prix);
   }

   @Override
   public String getDescription() {
      // Retourne la description spécifique pour PainFrais
      return "Pain frais";
   }

   @Override
   public String necessiteEmballage() {
      // Retourne "Oui" pour indiquer que le pain frais nécessite un emballage
      return "Oui";
   }

   @Override
   public String estEmballageBiodegradable() {
      // Retourne "Oui" pour indiquer que l'emballage est biodégradable
      return "Oui";
   }

   @Override
   public boolean estFrais() {
      // Retourne true pour indiquer que le pain frais est un produit frais
      return true;
   }
}
