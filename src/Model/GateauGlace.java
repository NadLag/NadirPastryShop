package Model;

import Model.Interface.Emballable;
import Model.Interface.Perissable;
import Model.Interface.Refrigerable;

public class GateauGlace extends Produit implements Emballable, Perissable, Refrigerable {
   private double temperatureRefrigeration;

   public GateauGlace(String nom, String codeUnique, double poids, double prix, double temperatureRefrigeration) {
      super(nom, codeUnique, poids, prix);
      this.temperatureRefrigeration = temperatureRefrigeration;
   }

   @Override
   public String getDescription() {
      // Retourne la description spécifique pour GateauGlace
      return "Gâteau glacé";
   }

   @Override
   public String necessiteEmballage() {
      // Retourne "Oui" pour indiquer que le gâteau glacé nécessite un emballage
      return "Oui";
   }

   @Override
   public String estEmballageBiodegradable() {
      // Retourne "Non" pour indiquer que l'emballage n'est pas biodégradable
      return "Non";
   }

   @Override
   public boolean estFrais() {
      // Retourne true pour indiquer que le gâteau glacé est un produit frais
      return true;
   }

   @Override
   public double getTemperatureRefrigeration() {
      // Retourne la température de réfrigération pour le gâteau glacé
      return temperatureRefrigeration;
   }

   @Override
   public boolean estBienRefrigere() {
      // Retourne true pour indiquer que le gâteau glacé est bien réfrigéré
      return true;
   }
}
