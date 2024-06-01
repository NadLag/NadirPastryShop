package Model;

import Model.Interface.Perissable;

public abstract class ProduitLocal extends Produit implements Perissable {

   protected String dateMiseEnConserve;
   protected String dateFinValidite;

   public ProduitLocal(String nom, String codeUnique, double poids, double prix, String dateMiseEnConserve, String dateFinValidite) {
      super(nom, codeUnique, poids, prix);
      this.dateMiseEnConserve = dateMiseEnConserve;
      this.dateFinValidite = dateFinValidite;
   }

   // Getter pour l'attribut dateMiseEnConserve
   public String getDateMiseEnConserve() {
      return dateMiseEnConserve;
   }

   // Getter pour l'attribut dateFinValidite
   public String getDateFinValidite() {
      return dateFinValidite;
   }

   @Override
   public boolean estFrais() {
      // Retourne true pour indiquer que le produit local est frais
      return true;
   }
}
